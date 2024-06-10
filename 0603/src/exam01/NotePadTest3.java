package exam01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePadTest3 extends JFrame{
    JFileChooser jfc;
    JTextArea jta;
    FileWriter fw;
    FileReader fr;
    String text;

    public NotePadTest3(){
//        setTitle("메모장");
        super("메모장");

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

        file_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("새파일");
                if (jfc.getSelectedFile() != null && text.equals(jta.getText())){
                    // 열기로 불러옴 & 열었을 때 텍스트와 지금 텍스트가 변경됐는지?
                    System.out.println("열기된 파일이 변경됨");
                    try {
                        int ch;
//                    String data = "";
                        StringBuffer data = new StringBuffer();
                        fr = new FileReader(jfc.getSelectedFile());
                        while ( (ch=fr.read()) != -1){
//                        jta.append((char)ch + "");
                            data.append((char) ch);
                        }
//                    jta.setText(data);
                        jta.setText(data.toString());
                    }catch (Exception ex){
                        System.out.println("예외발생 : "+ex.getMessage());
                    }


                }
            }
        });

        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = jta.getText();
                System.out.println("text = " + text);
                System.out.println("열기");
                if (jfc.showOpenDialog(null) == 0){
                    try {
                        int ch;
//                    String data = "";
                        StringBuffer data = new StringBuffer();
                        fr = new FileReader(jfc.getSelectedFile());
                        while ( (ch=fr.read()) != -1){
//                        jta.append((char)ch + "");
                            data.append((char) ch);
                        }
//                    jta.setText(data);
                        jta.setText(data.toString());
                    }catch (Exception ex){
                        System.out.println("예외발생 : "+ex.getMessage());
                    }
                }
            }
        });

        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("저장");
                String data = jta.getText();
//                System.out.println(data);
//                System.out.println(jfc.showSaveDialog(null));
                if (jfc.showSaveDialog(null) == 0){
                    try{
                        fw = new FileWriter(jfc.getSelectedFile());
                        fw.write(data);
                        fw.close();
                        JOptionPane.showMessageDialog(null, "파일을 생성하였습니다.");
                    }catch (Exception ex){
                        System.out.println("예외발생 : "+ex.getMessage());
                    }
                }

            }
        });
    }

    public static void main(String[] args) {
        new NotePadTest3();
    }
}
