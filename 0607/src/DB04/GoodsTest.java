package DB04;

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
                int selNo = Integer.parseInt(rowData.get(r).getFirst());
                GoodsVO goodsVO = goodsDAO.selectRow(selNo);
                if (goodsVO != null){
                    noTF.setText(String.valueOf(goodsVO.getNo()));
                    itemTF.setText(goodsVO.getItem());
                    qtyTF.setText(String.valueOf(goodsVO.getQty()));
                    priceTF.setText(String.valueOf(goodsVO.getPrice()));
                }
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
                int re = goodsDAO.insertGoods(new GoodsVO(
                        Integer.parseInt(noTF.getText()), itemTF.getText(),
                        Integer.parseInt(qtyTF.getText()),  Integer.parseInt(priceTF.getText()
                )));
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
                int re = goodsDAO.updateGoods(new GoodsVO(
                        Integer.parseInt(noTF.getText()), itemTF.getText(),
                        Integer.parseInt(qtyTF.getText()),  Integer.parseInt(priceTF.getText()
                )));
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
                int re = goodsDAO.deleteGoods(Integer.parseInt(noTF.getText()));
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
