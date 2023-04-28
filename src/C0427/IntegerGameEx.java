package C0427;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerGameEx extends JFrame{
    IntegerGameEx(){
        this.setTitle("숫자 추측 게임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = getContentPane();
        JPanel Toppan = new JPanel();
        JPanel Midpan = new JPanel();
        JPanel Lowpan = new JPanel();
        con.setLayout(new FlowLayout());


        JLabel lb = new JLabel("숫자 추측 :");
        JTextField tf = new JTextField(10);
        Toppan.add(lb);
        Toppan.add(tf);

        JLabel result = new JLabel("시작",JLabel.CENTER);
        result.setOpaque(true);
        result.setBackground(Color.YELLOW);
        Midpan.add(result);

        JButton btnonemore = new JButton("다시 한번");
        JButton btnexit = new JButton("종료");
        Lowpan.add(btnonemore);
        Lowpan.add(btnexit);

        con.add(Toppan);
        con.add(Midpan);
        con.add(Lowpan);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = (int)(Math.random() * 100);
                int k =30;
                JTextField t = (JTextField)e.getSource();
                if(t.equals(k)){
                    System.out.println("1111");
                }
                else System.out.println("2222");
            }
        });

        this.setSize(200,250);
        this.setVisible(true);
    }
}
