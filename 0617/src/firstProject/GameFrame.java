package firstProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame {
    public static boolean isplaying;      // 게임 진행 상황

    private GamePanel gamePanel;
    private ChattingPanel chattingPanel;


    public GameFrame(){
        super("Finding the Wrong Picture");

        gamePanel = new GamePanel();
        gamePanel.setPreferredSize(new Dimension(1450,850));
//        gamePanel.setBorder(new LineBorder(Color.BLACK));

//        chattingPanel = new ChattingPanel();
//        chattingPanel.setPreferredSize(new Dimension(330, 900));
//        chattingPanel.setBorder(new LineBorder(Color.GREEN));

        add(gamePanel, BorderLayout.WEST);
//        add(chattingPanel, BorderLayout.EAST);


        setSize(1470,850);
        setVisible(true);
        setResizable(false);    // 사이즈 고정
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);   //종료 이벤트

        // 종료 이벤트
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeMethod();
            }
        });

    }

    public static void closeMethod(){   // JFrame 종료 메서드
        if (isplaying){
            int option = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "확인",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.NO_OPTION) { return; }
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}
