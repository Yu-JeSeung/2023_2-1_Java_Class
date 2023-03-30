package C0330;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx(){
        this.setTitle("FlowLayout 설정");
        this.setSize(300,150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();

        con.setLayout(new FlowLayout(FlowLayout.LEFT, 30,40));
        con.add(new JButton("add"));
        con.add(new JButton("sub"));
        con.add(new JButton("mul"));
        con.add(new JButton("div"));
        con.add(new JButton("Calculate"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
