package DB01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class ListStudentGUI_JTable02 extends JFrame {
    JPanel panel_south;
    Vector<String> colName;
    Vector<Vector<String>> rowData;
    JTable table;

    JButton readBtn;
    String sql = "select * from student";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ListStudentGUI_JTable02(){
        colName = new Vector<>();
        colName.add("이름");
        colName.add("국어");
        colName.add("영어");
        colName.add("수학");
        rowData = new Vector<>();

        panel_south = new JPanel();
        table = new JTable(rowData, colName);
        JScrollPane jScrollPane = new JScrollPane(table);
        panel_south.setLayout(new FlowLayout(FlowLayout.RIGHT));
        readBtn = new JButton("읽기");
        panel_south.add(readBtn);

        add(jScrollPane, BorderLayout.CENTER);
        add(panel_south, BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {
                String result = "";
                int idx = table.getSelectedRow();
                Vector<String> row = rowData.get(idx);
                for (int i = 0; i <row.size() ; i++) {
                    result += row.get(i)+" ";
                }
                System.out.println(result);
            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        readBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowData.clear();
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conn = DriverManager.getConnection(
                            "jdbc:oracle:thin:@localhost:1521:XE","c##madang", "madang");
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(sql);
                    // 한건만 있으면 if 가 좋음
                    while (rs.next()){
                        Vector<String> result1 = new Vector<>();
                        result1.add(rs.getString(1));
                        result1.add(String.valueOf(rs.getInt(2)));
                        result1.add(String.valueOf(rs.getInt(3)));
                        result1.add(String.valueOf(rs.getInt(4)));
                        rowData.add(result1);
                    }
                    table.updateUI();
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
        new ListStudentGUI_JTable02();
    }
}
