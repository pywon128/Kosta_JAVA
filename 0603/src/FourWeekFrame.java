package FourWeek;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FourWeekFrame extends JFrame {
    private final String[] RESULT = {
            "천귀", "천액", "천권", "천파", "천간", "천문", "천복", "천역", "천고", "천인", "천예", "천수"
    };
    private final Map<String, String> RESULT_MAP = new HashMap<>(){
        {
            put("천귀", "귀격, 고귀한 신분, 인격, 신망");
            put("천액","액이 따름, 고생을 겪음");
            put("천권","권세를 누림, 파워 있는 신분, 품위 있는 인격");
            put("천파","실패, 실수, 파란곡절, 주색, 낭만");
            put("천간","지혜발달, 권모술수, 수단가");
            put("천문","학문,과거운,인격자,선량함,교육자,의술");
            put("천복","복록, 재물의 풍족, 인덕");
            put("천역","역마살(役馬煞)로 활동성, 부지런함 동분서주");
            put("천고","고독, 소극적, 남과 잘 어울리지 않음. 편굴(偏屈)성");
            put("천인","부상당하거나 질병 따름, 동분서주.");
            put("천예","예능 발달, 수단가, 낭만적");
            put("천수","정직, 공명정대, 고독");
        }
    };
    private ArrayList<Integer> dateOfBirth; // 생년(띠),생월,생일,생시를 천술 index 로 변환한 값을 저장하는 리스트
    private String[] animals = { "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지"};
    private String[] inputLabel = {"이름", "띠(동물)", "생월", "생일", "생시(1~24)"};
    private ArrayList<String> resultMapKey;  // RESULT_MAP 의 Key
    private ArrayList<JTextField> inputTextFields;
    private ArrayList<JLabel> center_label;
    private ArrayList<JLabel> result_label;

    public FourWeekFrame(){
        setTitle("사주풀이");
        setLayout(new BorderLayout());
        inputTextFields = new ArrayList<>();
        center_label = new ArrayList<>();
        result_label = new ArrayList<>();

        // TOP
        JPanel panel_top = new JPanel(new GridLayout(1,2));
        JPanel panel_top_L = new JPanel(new GridLayout(5,2));
        JPanel panel_top_R = new JPanel();

        // TOP_L
        panel_top_L.setBorder(new LineBorder(Color.BLACK));
        for (int i = 0; i < 5 ; i++) {
            panel_top_L.add(new JLabel(inputLabel[i]));
            inputTextFields.add(new JTextField(10));
            panel_top_L.add(inputTextFields.get(i));
        }
        panel_top.add(panel_top_L);     // panel_top 에 추가

        // TOP_R
        panel_top_R.setBorder(new LineBorder(Color.BLACK));
        panel_top_R.setLayout(new GridLayout(2,1));
//        panel_top_R.setBackground(Color.WHITE);
        JButton btnSolve = new JButton("풀 이");
        JLabel stateLabel = new JLabel("정보를 입력해주세요");
        stateLabel.setOpaque(true);    // 배경 투명하지 않게
        panel_top_R.add(btnSolve);
        panel_top_R.add(stateLabel);
        panel_top.add(panel_top_R);     // panel_top 에 추가

        // CENTER
        JPanel panel_center = new JPanel(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬
        panel_center.setBackground(Color.BLACK);

        for (int i = 0; i < RESULT.length; i++) {
            center_label.add(new JLabel(RESULT[i]));    // 천술 라벨 생성
            center_label.get(i).setOpaque(false);       // 배경 투명하게
            center_label.get(i).setForeground(Color.WHITE); // 폰트색상
            panel_center.add(center_label.get(i));
        }

        // BOTTOM
        JPanel panel_south = new JPanel(new GridLayout(4,1));
        panel_south.setPreferredSize(new Dimension(450,220));
        for (int i = 0; i < 4; i++) {
            result_label.add(new JLabel());
            panel_south.add(result_label.get(i));
        }
        panel_south.setBorder(new LineBorder(Color.BLACK));

        // JFrame 에 추가
        add(panel_top, BorderLayout.NORTH);
        add(panel_center, BorderLayout.CENTER);
        add(panel_south, BorderLayout.SOUTH);

        setSize(450,400);
        setResizable(false);    // 사이즈 고정
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JLabel jLabel : center_label){     // 천술 폰트색 초기화
                    jLabel.setForeground(Color.WHITE);
                }
                if (checkInfo()){
                    stateLabel.setText("성공!");
                    stateLabel.setBackground(Color.GREEN);
//                    System.out.println("resultMapKey = " + resultMapKey);
                    for (int i = 0; i < resultMapKey.size(); i++){
                        for (JLabel jLabel : center_label){
                            if(jLabel.getText().equals(resultMapKey.get(i))){
                                jLabel.setForeground(Color.RED);
                            }
                        }
                        result_label.get(i).setText(resultMapKey.get(i)+
                                " : "+RESULT_MAP.get(resultMapKey.get(i)));
                    }
                }else {
                    stateLabel.setBackground(Color.RED);
                    stateLabel.setText("잘못된 정보 입력입니다.");
                }
            }
        });
    }
    private boolean checkInfo(){
        dateOfBirth = new ArrayList<>();
        try {
            dateOfBirth.add(setStartNumber(inputTextFields.get(1).getText()));      // 띠
            dateOfBirth.add(Integer.parseInt(inputTextFields.get(2).getText())-1);    // 생월
            dateOfBirth.add(setBirth(Integer.parseInt(inputTextFields.get(2).getText()),
                                            Integer.parseInt(inputTextFields.get(3).getText())));    // 생일
            dateOfBirth.add(setTime(Integer.parseInt(inputTextFields.get(4).getText())));      // 생시
//            System.out.println("dateOfBirth = " +dateOfBirth);
            getConvert();   // dateOfBirth -> resultMapKey 생성
            return !dateOfBirth.contains(-1);
        }catch (Exception e){ return false; }
    }
    private int setStartNumber(String inputStrYear){
        // 띠를 입력받아 천술의 시작 index 번호를 리턴하는 메서드 (0~11)
        int start=0;
        for (String animal : animals){
            if (animal.equals(inputStrYear)){ return start; }
            start++;
        }
        return -1;
    }
    private int setBirth(int month, int day){
        // 생월과 생일을 입력받아 천술의 index 번호로 변환하여 setDay 를 리턴하는 메서드 (0~11)
        int setDay, lastDay = 31;
        if (month == 2) lastDay = 28;
        else if (month==4||month==6||month==9||month==11) lastDay = 30;
        return (month >= 1 && month <= 12 && day > 0 && day <= lastDay) ? (day-1)%12 : -1;
    }
    private int setTime(int inputTime){
        // 생시를 입력받아 천술의 index 번호로 변환하여 setTime 를 리턴하는 메서드 (0~11)
        // 23~24, 1~2, 3~4, 5~6, 7~8, 9~10, 11~12, 13~14, 15~16, 17~18, 19~20, 21~22
        return inputTime >= 1 && inputTime <= 24 ? (((inputTime-1)/2)+1)%12 : -1;
    }
    private void getConvert(){
        resultMapKey = new ArrayList<>();
        int shiftNum = dateOfBirth.getFirst();
        resultMapKey.add(RESULT[shiftNum]);

        for (int i = 1; i < dateOfBirth.size(); i++) {
            shiftNum += dateOfBirth.get(i);
            if (shiftNum >= 12){ shiftNum %= 12; }
            resultMapKey.add(RESULT[shiftNum]);
        }
    }
    public static void main(String[] args) { new FourWeekFrame(); }
}