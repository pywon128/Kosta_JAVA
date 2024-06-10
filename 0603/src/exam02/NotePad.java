package exam02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePad extends JFrame {
    JTextArea jta;

    //파일 열기나 저장할 때 파일을 선택하기 위한 대화상자 변수를 멤버로 선언
    JFileChooser jfc;

    // 현재 작업하고 있는 파일을 참조할 변수
    File file;

    // 파일에 변경된 내용이 잇는지 판별하기 위한 변수를 선언
    // 파일을 저장하거나 열어오면 변경상태가 없음으로 isNew 에 false 를 저장
    // TextArea 한글자라도 입력되면 isNew 에 true 를 저장
    boolean isNew;

    // 파일을 저장하기 위한 메서드
    public void saveFile(){
        // 파일로 저장할 문자열을 가지고 옴 ( JTextArea )
        String data = jta.getText();

        // 이미 파일이 열려있으면 파일선택 대화상자를 열지 않고 저장해야 하기 때문에 0 으로 초기화
        int re = 0;

        //파일이 열려있지 않으면 어떤 이름으로 저장할지 물어볼 대화상자를 띄움
        if (file == null){
            //어떤 이름으로 저장할지 물어볼 대화상자 띄움 ( 저장 : 0 / 취소 : 1 )
            re = jfc.showSaveDialog(null);
            // 대화상자에서 "저장"을 눌렀으면 저장
            if (re == 0){
                // 대화상자에 입력한 파일 정보를 가지고 와서 file 에 저장
                file = jfc.getSelectedFile();
            }
        }

        // 이미 파일이 오픈되어 있거나 파일저장 대화상자에서 "저장"을 눌렀다면 파일에 저장
        if (re == 0){
            try {
                // 문자단위의 파일 출력을 위한 객체를 생성
                FileWriter fr = new FileWriter(file);

                //파일로 내용을 출력
                fr.write(data);
                //파일 닫기
                fr.close();
                setTitle(file.getName());
                isNew = false;
                JOptionPane.showMessageDialog(null,"저장하였습니다.");
            }catch (Exception e){
                System.out.println("예외 발생 : "+e.getMessage());
            }
        }
    }

    public NotePad(){
        super("제목없음");

        jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        jfc = new JFileChooser("c:/data");
        add(jsp);

        JMenuBar jmb = new JMenuBar();
        JMenu mn_file = new JMenu("파일");  // 주메뉴
        JMenuItem file_new = new JMenuItem("새 파일"); // 부메뉴
        JMenuItem file_open = new JMenuItem("열기");
        JMenuItem file_save = new JMenuItem("저장");
        mn_file.add(file_new);
        mn_file.add(file_open);
        mn_file.add(file_save);
        jmb.add(mn_file);

        setJMenuBar(jmb);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TextArea 에 키 이벤트 등록
        jta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {

            }
            @Override
            public void keyReleased(KeyEvent e) {
                // 글씨가 한글자라도 써지면 isNew 설정
                isNew = true;
            }
        });

        file_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 파일을 TextArea 에 저장되지 않는 변경된 내용이 있으면 "저장하시겠습니까?" 라고 물어봄
                if (isNew){
                    int re = JOptionPane.showConfirmDialog(null, "변경된 내용을 저장하시겠습니까?");
                    // 0 : 예, 1 : 아니오, 2 : 취소
                    if (re == 2) { return; }
                    if (re == 0) { saveFile(); }
                }
                // 새파일을 누르면 TextArea 초기화
                jta.setText("");

                // 새파일을 했으므로 file에 null 설정
                file = null;

                //새파일을 했으므로 제목표시줄에 "제목없음"으로 설정
                setTitle("제목없음");
            }
        });
        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // 열어올 파일을 선택하기 위한 대화상자를 열기 ( 0 : 열기, 1 : 취소 )
                int re = jfc.showOpenDialog(null);

                if (re == 0){
                    //파일열기 대화상자에서 선택한 파일의 정보를 file 변수에 저장
                    file = jfc.getSelectedFile();
                    try {
                        // 문자단위 파일의 내용을 컴퓨터 메모리로 읽어들이기 위한 객체 생성
                        FileReader fr = new FileReader(file);

                        //파일로 부터 한글자씩 읽어 들이기 위한 변수를 선언
                        int ch;

                        //파일의 전체 내용을 저장하기 위한 변수 선언
                        String data = "";

                        // 파일의 끝이 아닐때까지 읽어들여 data에 저장
                        while ( (ch = fr.read()) != -1  ){
                            data += (char) ch + "";
                        }

                        //파일로부터 읽어들인 전체문자열 data 를 TextArea 에 설정
                        jta.setText(data);

                        //파일 닫기
                        fr.close();

                        //열어온 파일명을 타이틀바에 설정
                        setTitle(file.getName());

                        isNew = false;

                    }catch (Exception ex){
                        System.out.println("예외발생 : "+ex.getMessage());
                    }
                }
            }
        });
        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
    }

    public static void main(String[] args) {
        new NotePad();
    }

}
