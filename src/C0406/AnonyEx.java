package C0406;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonyEx extends JFrame{
    public AnonyEx(){
        this.setTitle("내부 클래스 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.setBackground(Color.YELLOW);

        JButton btn = new JButton("Action");
        con.add(btn);

        // 이벤트 리스너를 추가
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                System.out.println(b);
                if(b.getText().equals("Action")){
                    b.setText("액션");
                }
                else
                    b.setText("Action");
            }
        });

        this.setSize(350,150);
        this.setVisible(true);
    }
}
