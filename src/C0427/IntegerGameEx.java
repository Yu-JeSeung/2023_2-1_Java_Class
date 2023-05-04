package C0427;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class IntegerGameEx extends JFrame{
    Random random = new Random();
    int rndNum = random.nextInt(101);
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
                int input = Integer.parseInt(tf.getText());
                if(input<rndNum){
                    result.setText("숫자가 작습니다.");
                    result.setBackground(Color.RED);
                }
                else if(input==rndNum){
                    result.setText("정답");
                    result.setBackground(Color.GREEN);
                }
                else {
                    result.setText("숫자가 큽니다.");
                    result.setBackground(Color.BLUE);
                }
            }
        });

        btnonemore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                rndNum = random.nextInt(101);
                System.out.println("다시 한번 정답"+rndNum);
            }
        });

        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("시스템 종료");
                System.exit(0);
            }
        });


        this.setSize(200,250);
        this.setVisible(true);
    }
}
