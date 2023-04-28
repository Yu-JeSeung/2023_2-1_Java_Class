package C0427;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioEx extends JFrame{
    RadioEx(){
        this.setTitle("라디오 버튼 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("/Users/jeseung/Documents/사진/git_logo.png");
        ImageIcon selectedCherryIcon = new ImageIcon("/Users/jeseung/Documents/사진/python_logo.png");

        ButtonGroup g = new ButtonGroup();
        JRadioButton apple = new JRadioButton("사과");
        JRadioButton bae = new JRadioButton("배");
        JRadioButton cherry = new JRadioButton("체리");
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        g.add(apple);
        g.add(bae);
        g.add(cherry);

        con.add(apple);
        con.add(bae);
        con.add(cherry);

        apple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(apple.isSelected())
                    System.out.println("사과를 선택했어요잇");
                else System.out.println("사과 선택 해제");
            }
        });

        bae.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(bae.isSelected())
                    System.out.println("배를 선택했어요잇");
                else System.out.println("배 선택 해제");
            }
        });

        cherry.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cherry.isSelected())
                    System.out.println("체리 선택했어요잇");
                else System.out.println("체리 선택 해제");
            }
        });

        this.setSize(300,300);
        this.setVisible(true);
    }
}
