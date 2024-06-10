package DB02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;


public class StudentTest extends JFrame {
    JTextField jtf_name;
    JTextField jtf_kor;
    JTextField jtf_eng;
    JTextField jtf_math;

    JTable table;
    Vector<String> colNames;
    Vector<Vector<String>> rowData;

    public void loadStudent(){
        rowData.clear();
        StudentDAO studentDAO = new StudentDAO();
        ArrayList<StudentVO> lists = studentDAO.listSutent();
        for (StudentVO s : lists){
            Vector<String> row = new Vector<>();
            row.add(s.getName());
            row.add(s.getKor()+"");
            row.add(s.getEng()+"");
            row.add(s.getMath()+"");
            rowData.add(row);
        }
        table.updateUI();
    }


    public StudentTest() {
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

        setSize(650, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loadStudent();

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {
                int idx = table.getSelectedRow();
                Vector<String> row = rowData.get(idx);
                jtf_name.setText(row.get(0));
                jtf_kor.setText(row.get(1));
                jtf_eng.setText(row.get(2));
                jtf_math.setText(row.get(3));

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtf_name.getText();
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());
                StudentVO studentVO = new StudentVO(name, kor, eng, math);
                StudentDAO studentDAO = new StudentDAO();
                int re = studentDAO.insertStudent(studentVO);

                if (re == 1){
                    JOptionPane.showMessageDialog(null, "성공");
                    loadStudent();
                }else {
                    JOptionPane.showMessageDialog(null, "실패");
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtf_name.getText();
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());
                StudentVO studentVO = new StudentVO(name, kor, eng, math);
                StudentDAO studentDAO = new StudentDAO();
                int re = studentDAO.updateStudent(studentVO);
                System.out.println(re);

                if (re > 0){    // 이름이 중복 될 수 있어서 re 가 1보다 클 수 있음
                    JOptionPane.showMessageDialog(null, "성공");
                    loadStudent();
                }else {
                    JOptionPane.showMessageDialog(null,"실패");
                }
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
                int sel = JOptionPane.showConfirmDialog(null,"삭제?", "회원정보", JOptionPane.YES_NO_OPTION);
                if (sel == 1) return;

                StudentDAO studentDAO = new StudentDAO();
                int re = StudentDAO.deleteStudent(name);
                if (re > 0){
                    JOptionPane.showMessageDialog(null, "성공");
                    loadStudent();
                }else {
                    JOptionPane.showMessageDialog(null, "실패");
                }
            }
        });
    }

    public static void main(String[] args) {
        new StudentTest();
    }
}