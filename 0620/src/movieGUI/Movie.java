package movieGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

//극장별 예약건수, 총수익을 출력하는 프로그램을 작성

public class Movie extends JFrame {
    JLabel theaterNameLabel;
    JTextField theaterNameTextField;
    JButton searchBtn;
    JTable table;

    Vector<String> columnNames;
    Vector<Vector<String>> rowData;

    ArrayList<MovieVO> movieVO;

    String[] colNames = {"극장명","예약건수", "총수익"};

    public Movie(){
        rowData = new Vector<>();

        JPanel top = new JPanel(new FlowLayout());
        theaterNameLabel = new JLabel("극장명 입력 : ");
        theaterNameTextField = new JTextField(20);
        searchBtn = new JButton("조회");

        top.add(theaterNameLabel);
        top.add(theaterNameTextField);
        top.add(searchBtn);

        columnNames = new Vector<>();
        columnNames.addAll(Arrays.asList(colNames));
        table = new JTable(rowData, columnNames);
        JScrollPane jsp = new JScrollPane(table);

        add(top, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);

        setSize(400,300);
        setVisible(true);
        setResizable(false);    // 사이즈 고정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowData.clear();

                movieVO = MovieDAO.search(theaterNameTextField.getText());
                for (MovieVO vo : movieVO){
                    Vector<String> stringVector = new Vector<>();
                    stringVector.add(vo.getTheaterName());
                    stringVector.add(String.valueOf(vo.getReCount()));
                    stringVector.add(String.valueOf(vo.getTotal()));

                    rowData.add(stringVector);
                }
                table.updateUI();
            }
        });
    }
    public static void main(String[] args) {
        new Movie();
    }
}
