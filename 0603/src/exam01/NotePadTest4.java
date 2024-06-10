package exam01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePadTest4 extends JFrame{
    JFileChooser jfc;
    JTextArea jta;
    File file;
    String text;

    // 열어오거나 저장한 후에 변경된 내용이 있는지 판별할 변수
    boolean isNew;


    public void saveFile(){
        int re = 0;
        //저장할 다이얼로그에서 "저장", "취소:를 눌렀는지 판별할 변수
        // 이미 파일이 있는 경우를 대비하여 초기값 0을 설정
        if (file == null){  // 열린 파일이 없거나 저장한 파일이 없다면
            re = jfc.showSaveDialog(null);  // 어떤 파일로 저장할 것인지 다이어로그를 띄움
            if (re == 0){   // 저장하기 다이얼로그에서 "저장"을 눌렀다면
                file = jfc.getSelectedFile();
                // 다이얼로그에서 선택한 파일을 file 변수에 저장
            }
        }
        System.out.println("저장");
        String data = jta.getText();

        // 이미 열린 파일이 있거나 저장한 파일이 있거나
        // 저장하기 다이얼로그에 "저장"을 눌렀으면 저장한다.
        if (re == 0){
            try{
                FileWriter fw = new FileWriter(file);
                fw.write(data);
                fw.close();
                JOptionPane.showMessageDialog(null, "파일을 생성하였습니다.");
                setTitle(file.getName());
                isNew = false;
            }catch (Exception ex){
                System.out.println("예외발생 : "+ex.getMessage());
            }
        }
    }

    public NotePadTest4(){
//        super("메모장");
        setTitle("제목없음");


        jfc = new JFileChooser("C:/data");
        jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp);

        JMenuBar jmb = new JMenuBar();
        JMenu mn_file = new JMenu("파일");
        JMenuItem file_new = new JMenuItem("새 파일");
        JMenuItem file_open = new JMenuItem("열기");
        JMenuItem file_save = new JMenuItem("저장");
        mn_file.add(file_new);
        mn_file.add(file_open);
        mn_file.add(file_save);
        jmb.add(mn_file);

        setJMenuBar(jmb);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //TextArea에 키보드 이벤트를 설정
        jta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                isNew = true;

            }
        });

        file_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 변경된 내용이 있으면 "저장하시겠습니까" 물어보도록 함
                if (isNew){
                    int re = JOptionPane.showConfirmDialog(null, "변경된 내용을 저장하시겠습니까?");
                    System.out.println(re);
                    // 예 0, 아니오 1, 취소 2
                    // 예 :  변경된 내용 저장 -> 새파일
                    // 아니오 : 변경된 내용 저장

                    if (re == 2){
                        return;
                    }

                    if (re==0){
                        saveFile();
                    }
                }

                setTitle("제목없음");
//                System.out.println("새파일");
                jta.setText("");
            }
        });

        // 열기
        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = jta.getText();
                System.out.println("열기");
                int re = jfc.showSaveDialog(null);
                if (re == 0){
                    try {
                        int ch;
                        file = jfc.getSelectedFile();
//                    String data = "";
                        StringBuffer data = new StringBuffer();
                        FileReader fr = new FileReader(jfc.getSelectedFile());
                        setTitle(file.getName());
                        while ( (ch=fr.read()) != -1){
//                        jta.append((char)ch + "");
                            data.append((char) ch);
                        }
//                    jta.setText(data);
                        jta.setText(data.toString());
                        isNew = false;
                    }catch (Exception ex){
                        System.out.println("예외발생 : "+ex.getMessage());
                    }
                }
            }
        });

        //저장
        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
    }

    public static void main(String[] args) {
        new NotePadTest4();
    }
}
