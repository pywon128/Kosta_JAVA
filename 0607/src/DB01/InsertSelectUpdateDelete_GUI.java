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

// 학생의 이름, 국어, 영어, 수학을 입력받아
// student테이블에 정보를 추가하는 프로그램을 GUI로 작성합니다.
// 화면구성및 변수명등은 자유롭게 합니다.
public class InsertSelectUpdateDelete_GUI extends JFrame {
    JTextField jtf_name;
    JTextField jtf_kor;
    JTextField jtf_eng;
    JTextField jtf_math;



    JTable table;
    Vector<String> colNames;
    Vector<Vector<String>> rowData;

    public static String driver = "oracle.jdbc.driver.OracleDriver";
    public static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public static String username = "c##madang";
    public static String password = "madang";

    //데이터베이스 student의 모든 학생의 정보를 조회하여
    //JTable 에 출력하는 메서드
    public void loadStudent(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        rowData.clear();
        String sql = "select * from student";
        try {
            //1. jdbc드라이버를 메모리로 로드한다.
            Class.forName(driver);

            //2. DB서버에 연결한다.
            conn = DriverManager.getConnection(url, username, password);

            //3. 데이터베이스 명령어 실행 담당 객체를 생성
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String name = rs.getString(1);
                int kor = rs.getInt(2);
                int eng = rs.getInt(3);
                int math = rs.getInt(4);
                Vector<String> row= new Vector<>();
                row.add(name);
                row.add(kor+"");
                row.add(eng+"");
                row.add(math+"");
                rowData.add(row);
            }
            table.updateUI();
        }catch (Exception e){
            System.out.println("예외 발생 : "+e.getMessage());
        }finally {
            try {
                if(rs != null) {
                    rs.close();
                }
                if(stmt != null) {
                    stmt.close();
                }
                if(conn != null) {
                    conn.close();
                }
            }catch(Exception e){
                System.out.println("예외 :"+e.getMessage());
            }
        }
    }

    public InsertSelectUpdateDelete_GUI() {
        jtf_name = new JTextField(10);
        jtf_kor = new JTextField(5);
        jtf_eng = new JTextField(5);
        jtf_math = new JTextField(5);

        JPanel p= new JPanel();

        p.add(new JLabel("이름"));
        p.add(jtf_name);
        p.add(new JLabel("국어"));
        p.add(jtf_kor);
        p.add(new JLabel("영어"));
        p.add(jtf_eng);
        p.add(new JLabel("수학"));
        p.add(jtf_math);

        JButton btnAdd= new JButton("등록");
        JButton btnUpdate= new JButton("수정");
        JButton btnDelete= new JButton("삭제");
        p.add(btnAdd);
        p.add(btnUpdate);
        p.add(btnDelete);

        colNames = new Vector<String>();
        colNames.add("이름");
        colNames.add("국어");
        colNames.add("영어");
        colNames.add("수학");
        rowData = new Vector<Vector<String>>();
        table = new JTable(rowData, colNames);
        JScrollPane jsp= new JScrollPane(table);

        add(p, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //JTable 에서 마우스를 눌렀다가 떼어지면 선택한 행의 인덱스를 가지고 온다.
                int idx = table.getSelectedRow();
                // JTable의 데이터를 가지고 있는 rowData로 부터 선택한 행의 정보를 가지고 온다
                Vector<String> row = rowData.get(idx);

                //가지고온 벡터로 부터 이름을 뽑아온다.
                String search = row.get(0);
                // 데이터베이스 테이블 student로 부터 선택한 학생의 이름에 해당하는
                // 레코드를 조회하기 위한 데이터베이스 명령어
                String sql = "select * from student where name = '"+search+"'";

                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;

                try {
                    Class.forName(driver);
                    conn = DriverManager.getConnection(url, username, password);
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(sql);
                    if (rs.next()){
                        String name = rs.getString(1);
                        int kor = rs.getInt(2);
                        int eng = rs.getInt(3);
                        int math = rs.getInt(4);
                        jtf_name.setText(name);
                        jtf_kor.setText(kor+"");
                        jtf_eng.setText(eng+"");
                        jtf_math.setText(math+"");
                    }
                }catch (Exception ex1){
                    System.out.println("예외 발생 : "+ex1.getMessage());
                }finally {
                    try {
                        if (rs != null) rs.close();
                        if (stmt != null) stmt.close();
                        if(conn != null) conn.close();
                    }catch (Exception ex2){
                        System.out.println("예외 발생 : "+ex2.getMessage());
                    }
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtf_name.getText();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"선택하셈");
                    return;
                }
                int r = JOptionPane.showConfirmDialog(null,"정말?","회원삭제",
                        JOptionPane.YES_NO_OPTION);
                if (r != 0) return;
                Connection conn = null;
                Statement stmt = null;

                String sql = "delete student where name='"+name+"'";
                try {
                    Class.forName(driver);
                    conn = DriverManager.getConnection(url, username, password);
                    stmt = conn.createStatement();
                    int re = stmt.executeUpdate(sql);

                    if (re > 0){
                        JOptionPane.showMessageDialog(null, "성공");
                        loadStudent();
                    }else {
                        JOptionPane.showMessageDialog(null, "실패");
                    }
                }catch (Exception ex1){
                    System.out.println("예외 발생 : "+ex1.getMessage());
                }finally {
                    try {
                        if (conn != null){ conn.close();}
                        if (stmt != null){ stmt.close();}
                    }catch (Exception ex2){
                        System.out.println("예외 발생 : "+ex2.getMessage());
                    }
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection conn = null;
                Statement stmt = null;

                String name = jtf_name.getText();
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());
                String sql = "update student set kor="+kor+", eng="+eng+", math="+math+" where name = '"+name+"'";

                try{
                    Class.forName(driver);
                    conn = DriverManager.getConnection(url, username, password);
                    stmt = conn.createStatement(); // 데이터베이스 명령 실행 담당자
                    int re = stmt.executeUpdate(sql);
                    if (re > 0 ){
                        JOptionPane.showMessageDialog(null, "학생의 정보를 수정하였습니다.");
                        loadStudent();
                    }else {
                        JOptionPane.showMessageDialog(null, "학생의 정보를 수정에 실패 하였습니다.");
                    }
                }catch (Exception ex){
                    System.out.println("예외 발생 : "+ex.getMessage());
                } finally {
                    try {
                        if (conn != null) {conn.close();}
                        if (stmt != null) {stmt.close();}
                    } catch (Exception ex1){
                        System.out.println("예외 발생 : "+ex1.getMessage());
                    }
                }
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection conn = null;
                Statement stmt = null;

                String name = jtf_name.getText();
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());
                try {
                    String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";

                    //1. jdbc드라이버를 메모리로 로드한다.
                    Class.forName(driver);

                    //2. DB서버에 연결한다.
                    conn = DriverManager.getConnection(url, username, password);
                    stmt = conn.createStatement();
                    //4. 데이터베이스 명령어를 실행한다.
                    int re = stmt.executeUpdate(sql);

                    if(re == 1) {
                        JOptionPane.showMessageDialog(null, "학생의 정보를 추가 하였습니다.");
                        loadStudent();
                    }else {
                        JOptionPane.showMessageDialog(null, "학생의 정보 추가에 실패하였습니다.");
                    }
                }catch (Exception ex) {
                    System.out.println("예외 발생:"+ex.getMessage());
                }
                finally {
                    try {
                        if(stmt != null) {
                            stmt.close();
                        }
                        if( conn != null) { conn.close(); }

                    }catch (Exception ex) {
                        System.out.println("예외발생 : "+ex.getMessage());
                    }
                }
            }
        });

        loadStudent();

        setSize(650, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new InsertSelectUpdateDelete_GUI();
    }
}