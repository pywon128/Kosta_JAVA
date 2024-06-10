package exam03;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.ECField;
import java.util.Vector;

public class FileTestJFrame extends JFrame {
    Vector<String> v;

    JList<String> list;
    JTextArea jta;

    public FileTestJFrame(){
        v = new Vector<>();
        File dir = new File("C:/data");
        String[] arr = dir.list();
        jta = new JTextArea();

        for (String fname : arr){
            if (fname.endsWith(".txt") || fname.endsWith(".java")){
                v.add(fname);
            }
        }


        list = new JList<>(v);
        JScrollPane jsp_list = new JScrollPane(list);

        jta = new JTextArea();
        JScrollPane jsp_jta = new JScrollPane(jta);

        add(jsp_list, BorderLayout.WEST);
        add(jsp_jta, BorderLayout.CENTER);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        list.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() >= 2){
                    File file = new File(dir.getPath()+"\\"+list.getSelectedValue());
                    file.delete();
                    jta.setText("");
                    File dir = new File("C:/data");
                    String[] arr = dir.list();
                    v.clear();
                    for (String fname : arr){
                        if (fname.endsWith(".txt") || fname.endsWith(".java")){
                            v.add(fname);
                        }
                    }
                    // 백터의 내용이 바뀌었으니 리스트를 다시 그려줄 것을 요청
                    list.updateUI();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {
                String name = list.getSelectedValue();
                String data = "";
                int ch;
                FileReader fileReader = null;
//                System.out.println(dir.getPath()+"\\"+name);
                try {
                    fileReader = new FileReader(dir.getPath()+"\\"+name);
                    while ((ch=fileReader.read()) != -1){
                        data += (char)ch;
                    }
                    jta.setText(data);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }finally {
                    try {
                        if (fileReader != null){
                            fileReader.close();
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
            @Override
            public void mouseDragged(MouseEvent e) {

            }
            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new FileTestJFrame();
    }
}
