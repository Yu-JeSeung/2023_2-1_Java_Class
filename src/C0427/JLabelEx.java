package C0427;

import javax.swing.*;
import java.awt.*;

public class JLabelEx extends JFrame {
    JLabelEx(){
        this.setTitle("레이블 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.add(new JLabel("사랑합니다"));

        ImageIcon image = new ImageIcon("/Users/jeseung/Documents/사진/뿌뿌123.png");
        JLabel lbimg = new JLabel(image);
        con.add(lbimg);
        JLabel img = new JLabel(image);

        this.setSize(300,300);
        this.setVisible(true);
    }
}
