package C0504;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderEx2 extends JFrame {
    SliderEx2(){
        this.setTitle("슬라이더 예제2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());

        // 배열 array 3개 짜리 생성 -> 객체 아님!!!
        JSlider s1 [] = new JSlider[3];
        int     arr [] = new int[3];

        // 슬라이더 3개 만들기
        for(int i=0;i<s1.length;i++){
            s1[i]=new JSlider(JSlider.HORIZONTAL,0,255,128); // 생성자로 객체 만듬 ()의 유무!!
            s1[i].setPaintLabels(true);
            s1[i].setPaintTicks(true);
            s1[i].setPaintTrack(true);
            s1[i].setMajorTickSpacing(50);
            s1[i].setMinorTickSpacing(10);

            con.add(s1[i]);
        }

        // 슬라이더 색상 정하기
        s1[0].setForeground(Color.RED);
        s1[1].setForeground(Color.GREEN);
        s1[2].setForeground(Color.BLUE);

        // 실시간으로 색상 값 읽어오기
        int r = s1[0].getValue();
        int g = s1[1].getValue();
        int b = s1[2].getValue();

        JLabel lbCol = new JLabel("슬라이더 색상 변경 예제");

        // 기본 읽은 색 값만 넣기
        lbCol.setOpaque(true); // 투명도
        lbCol.setBackground(new Color(r,g,b));

        con.add(lbCol);

        // 확인 버튼을 누르면 값을 읽어서 색을 변화시킴
        JButton btn1 = new JButton("확인");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 대충 rgb 변수 전역으로 설정하고 해도 됨
                int r = s1[0].getValue();
                int g = s1[1].getValue();
                int b = s1[2].getValue();
                lbCol.setBackground(new Color(r,g,b));
            }
        });
        con.add(btn1);

        this.setSize(300,300);
        this.setVisible(true);
    }
}
