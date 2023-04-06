package C0406;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButton extends JFrame {
    public TwoButton(){
        this.setTitle("버튼 만들기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.setBackground(Color.PINK);

        JButton btn = new JButton("확인");
        JButton btn2 = new JButton("취소");

        con.add(btn);
        con.add(btn2);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("확인버튼을 눌렀습니다.");

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("취소버튼을 눌렀습니다.");
                }

        });

        this.setSize(350,150);
        this.setVisible(true);
    }
}
