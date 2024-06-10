package DB03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodsTest extends JFrame {
    JTextField noTF;
    JTextField itemTF;
    JTextField qtyTF;
    JTextField priceTF;
    JButton addBtn;

    GoodsTest(String title){
        super(title);
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

        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        setSize(250,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no = Integer.parseInt(noTF.getText());
                String item = itemTF.getText();
                int qty = Integer.parseInt(qtyTF.getText());
                int price = Integer.parseInt(priceTF.getText());

                GoodsVO goodsVO = new GoodsVO(no, item, qty, price);
                GoodsDAO goodsDAO = new GoodsDAO();
                int re = goodsDAO.insertGoods(goodsVO);

                if (re == 1){
                    JOptionPane.showMessageDialog(null, "성공");
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
