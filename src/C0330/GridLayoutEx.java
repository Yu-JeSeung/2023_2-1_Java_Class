package C0330;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx(){
        this.setTitle("GridLayout 설정");
        this.setSize(300,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = getContentPane();

        GridLayout grid = new GridLayout(5,2);
        grid.setVgap(5);

        con.setLayout(grid);
        con.add(new JLabel("이름"));
        con.add(new JTextField(""));
        con.add(new JLabel("학번"));
        con.add(new JTextField(""));
        con.add(new JLabel("학과"));
        con.add(new JTextField(""));
        con.add(new JLabel("과목"));
        con.add(new JTextField(""));
        con.add(new JButton("확인"));
        con.add(new JButton("취소"));
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
