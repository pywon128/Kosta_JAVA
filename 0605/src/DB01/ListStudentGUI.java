package DB01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListStudentGUI extends JFrame {
    JPanel panel_south;
    JTextArea jTextArea;
    JButton readBtn;
    String sql = "select * from student";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ListStudentGUI(){
//        setLayout(new BorderLayout());
        panel_south = new JPanel();
        jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        panel_south.setLayout(new FlowLayout(FlowLayout.RIGHT));
        readBtn = new JButton("읽기");
        panel_south.add(readBtn);

        add(jScrollPane, BorderLayout.CENTER);
        add(panel_south, BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        readBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result ="";
                jTextArea.setText("");
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conn = DriverManager.getConnection(
                            "jdbc:oracle:thin:@localhost:1521:XE","c##madang", "madang");
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(sql);
                    while (rs.next()){
                        String name = rs.getString(1);
                        int kor = rs.getInt(2);
                        int eng = rs.getInt(3);
                        int math = rs.getInt(4);
                        result += name+", "+kor+", "+eng+", "+math+"\n";
                        jTextArea.append(result);
                    }
                }catch (Exception ex){
                    System.out.println("예외 발생 : "+ex.getMessage());
                }finally {
                    try {
                        if (conn != null) conn.close();
                        if (stmt != null) stmt.close();
                        if (rs != null) rs.close();
                    }catch (Exception exception){
                        System.out.println("예외 발생 : "+exception.getMessage());
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new ListStudentGUI();
    }
}
