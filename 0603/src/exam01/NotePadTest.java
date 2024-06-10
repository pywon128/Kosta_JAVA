package exam01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePadTest extends JFrame{
    JTextArea jta;

    public NotePadTest(){
//        setTitle("메모장");
        super("메모장");

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
            }
        });

        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("열기");
                try {
                    int ch;
                    String data = "";
                    FileReader fr = new FileReader("C:/data/memo.txt");
                    while ( (ch=fr.read()) != -1){
                        data += (char) ch;
                    }
                    jta.setText(data);
                }catch (Exception ex){
                    System.out.println("예외발생 : "+ex.getMessage());
                }
            }
        });

        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("저장");
                String data = jta.getText();
                System.out.println(data);
                try{
                    FileWriter fw = new FileWriter("C:/data/memo.txt");
                    fw.write(data);
                    fw.close();
                    System.out.println("파일을 생성하였습니다.");
                }catch (Exception ex){
                    System.out.println("예외발생 : "+ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        new NotePadTest();
    }
}
