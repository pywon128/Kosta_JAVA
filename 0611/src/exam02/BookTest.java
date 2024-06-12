package exam02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;


public class BookTest extends JFrame {
    JLabel publisherLabel;
    JTextField publisherTextField;
    JButton searchBtn;
    JTable table;

    Vector<String> columnNames;
    Vector<Vector<String>> rowData;

    ArrayList<BookVO> bookVO;

    String[] colNames = {"도서번호", "도서명", "도서가격", "판매가격", "판매일", "고객번호", "고객명", "전화번호"};

    public BookTest(){
        rowData = new Vector<>();
        JPanel top = new JPanel(new FlowLayout());
        publisherLabel = new JLabel("출판사 입력 : ");
        publisherTextField = new JTextField(20);
        searchBtn = new JButton("조회");
        top.add(publisherLabel);
        top.add(publisherTextField);
        top.add(searchBtn);

        columnNames = new Vector<>();
        columnNames.addAll(Arrays.asList(colNames));
        table = new JTable(rowData, columnNames);
        JScrollPane jsp = new JScrollPane(table);

        add(top, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);

        setSize(800, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowData.clear();
                bookVO = BookDAO.search(publisherTextField.getText());
                for (BookVO vo : bookVO){
                    Vector<String> stringVector = new Vector<>();
                    stringVector.add(String.valueOf(vo.getBookNo()));
                    stringVector.add(vo.getBookName());
                    stringVector.add(String.valueOf(vo.getBookPrice()));
                    stringVector.add(String.valueOf(vo.getSalePrice()));
                    stringVector.add(vo.getSaleDate());
                    stringVector.add(String.valueOf(vo.getCustomerNo()));
                    stringVector.add(vo.getCustomerName());
                    stringVector.add(vo.getCustomerPhone());
                    stringVector.add(vo.getPublisher());
                    rowData.add(stringVector);
                }
                table.updateUI();
            }
        });
    }


    public static void main(String[] args) {
        new BookTest();
    }
}
