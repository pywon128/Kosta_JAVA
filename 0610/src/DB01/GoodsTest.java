package DB01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

public class GoodsTest extends JFrame {
    JTextField noTF;
    JTextField itemTF;
    JTextField qtyTF;
    JTextField priceTF;
    JButton addBtn;
    JButton updateBtn;
    JButton deleteBtn;
    JTable table;

    Vector<String> colNames;
    Vector<Vector<String>> rowData;

    ArrayList<GoodsVO> lists;
    GoodsDAO goodsDAO;

    int no;
    String item;
    int qty;
    int price;

    public void setData(){
        no = Integer.parseInt(noTF.getText());
        item = itemTF.getText();
        qty = Integer.parseInt(qtyTF.getText());
        price = Integer.parseInt(priceTF.getText());
    }

    public void loadTable(){
        rowData.clear();
        lists = goodsDAO.goodsLists();
        for (GoodsVO g : lists){
            Vector<String> vector = new Vector<>();
            vector.add(g.getNo()+"");
            vector.add(g.getItem());
            vector.add(g.getQty()+"");
            vector.add(g.getPrice()+"");
            rowData.add(vector);
        }
        table.updateUI();
    }

    GoodsTest(String title){
        super(title);
        goodsDAO = new GoodsDAO();
        rowData = new Vector<>();

        JPanel top = new JPanel(new GridLayout(4,2));
        top.add(new JLabel("상품번호 : "));
        top.add(noTF = new JTextField());
        top.add(new JLabel("상품명 : "));
        top.add(itemTF = new JTextField());
        top.add(new JLabel("수량 : "));
        top.add(qtyTF = new JTextField());
        top.add(new JLabel("가격 : "));
        top.add(priceTF = new JTextField());

        JPanel center = new JPanel(new FlowLayout());
        center.add(addBtn = new JButton("등록"));
        center.add(updateBtn = new JButton("수정"));
        center.add(deleteBtn = new JButton("삭제"));

        JPanel bottom = new JPanel();
        colNames = new Vector<>();
        colNames.add("상품번호");
        colNames.add("상품명");
        colNames.add("수량");
        colNames.add("가격");
        table = new JTable(rowData, colNames);
        JScrollPane jsp = new JScrollPane(table);
        bottom.add(jsp);

        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        loadTable();

        setSize(470,600);
        setVisible(true);
        setResizable(false);
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
                int r = table.getSelectedRow();
                Vector<String> row = rowData.get(r);
                noTF.setText(String.valueOf(row.get(0)));
                itemTF.setText(row.get(1));
                qtyTF.setText(String.valueOf(row.get(2)));
                priceTF.setText(String.valueOf(row.get(3)));
            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                int re = goodsDAO.insertGoods(new GoodsVO(no,item,qty,price));
                if (re == 1){
                    JOptionPane.showMessageDialog(null, "성공");
                    loadTable();
                }else {
                    JOptionPane.showMessageDialog(null, "실패");
                }
            }
        });

        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                int re = goodsDAO.updateGoods(new GoodsVO(no,item,qty,price));
                if (re > 0){
                    JOptionPane.showMessageDialog(null, "성공");
                    loadTable();
                }else {
                    JOptionPane.showMessageDialog(null, "실패");
                }
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                int re = goodsDAO.deleteGoods(no);
                if (re>0){
                    JOptionPane.showMessageDialog(null, "성공");
                    loadTable();
                }else {
                    JOptionPane.showMessageDialog(null, "실패");
                }
            }
        });
    }

    public static void main(String[] args) {
        new GoodsTest("상품관리");
    }
}
