package C0330;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx(){
        this.setTitle("BorderLayout 설정");
        this.setSize(500,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new BorderLayout(30,20));
        con.add(new JButton("Calculate"),BorderLayout.CENTER);
        con.add(new JButton("add"),BorderLayout.NORTH);
        con.add(new JButton("sub"),BorderLayout.SOUTH);
        con.add(new JButton("mul"),BorderLayout.EAST);
        con.add(new JButton("div"),BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
