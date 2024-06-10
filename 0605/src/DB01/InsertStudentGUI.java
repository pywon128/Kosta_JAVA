package DB01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 학생의 이름, 국어, 영어, 수학을 입력받아
// student 테이블에 정보를 추가하는 프로그램을 GUI로 작성
// 화면구성및 변수명등은 자유롭게

public class InsertStudentGUI extends JFrame {
    Statement stmt = null;
    Connection conn = null;
    ArrayList<JTextField> jTextFields;
    ArrayList<JLabel> jLabels;
    JLabel resultLabel;
    JButton addBtn;
    String[] titles = {"이름 : ", "국어 : ", "영어 : ", "수학 : "};

    public InsertStudentGUI(){
        jTextFields = new ArrayList<>();
        jLabels = new ArrayList<>();
        setLayout(new BorderLayout());
        JPanel top = new JPanel(new BorderLayout());
        for (int i = 0; i < 4; i++) {
            jTextFields.add(new JTextField());
            jLabels.add(new JLabel(titles[i]));
            top.add(jLabels.get(i));
            top.add(jTextFields.get(i));
        }
        top.setLayout(new GridLayout(4,2));

        JPanel bottom = new JPanel(new FlowLayout());
        resultLabel = new JLabel("결과창 입니다.");
        addBtn = new JButton("추가");
        bottom.setLayout(new GridLayout(1,2));
        bottom.add(resultLabel);
        bottom.add(addBtn);

        add(bottom, BorderLayout.CENTER);
        add(top,BorderLayout.NORTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                int kor,eng,math;

                name = jTextFields.get(0).getText();
                kor = Integer.parseInt(jTextFields.get(1).getText());
                eng = Integer.parseInt(jTextFields.get(2).getText());
                math = Integer.parseInt(jTextFields.get(3).getText());
                try {
                    String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
                    //1. jdbc 드라이버를 메모리로 로드한다.
                    Class.forName("oracle.jdbc.driver.OracleDriver");

                    //2. DB서버에 연결한다.
                    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                            "c##madang", "madang");

                    //3. 데이터베이스 명령어 실행 담당 객체를 생성
                    stmt = conn.createStatement();

                    //4. 데이터베이스 명령어를 실행
                    int re = stmt.executeUpdate(sql);

                    if (re == 1){
                        resultLabel.setText("레코드 추가 성공");
                    } else {
                        resultLabel.setText("실패");
                    }

                } catch (Exception ex){
                    System.out.println(ex.getMessage());
                } finally {
                    try {
                        if (stmt != null){
                            stmt.close();
                        }
                        if (conn != null){
                            conn.close();
                        }
                    }catch (Exception exception){
                        System.out.println("예외발생 : "+exception.getMessage());
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new InsertStudentGUI();
    }
}
