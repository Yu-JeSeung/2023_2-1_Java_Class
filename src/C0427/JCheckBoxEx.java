package C0427;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxEx extends JFrame {
    JCheckBoxEx(){
        this.setTitle("레이블예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        JCheckBox cbapple = new JCheckBox("사과");
        JCheckBox cbbae = new JCheckBox("배",true); // 기본적으로 배에 체크가 되어있음

        ImageIcon cherry1 = new ImageIcon("/Users/jeseung/Documents/사진/뿌뿌.png");
        JCheckBox cbcherry = new JCheckBox("체리",cherry1);

        cbcherry.setBorderPaintedFlat(true); // 이미지 다시 그리기

        ImageIcon cherry2 = new ImageIcon("/Users/jeseung/Documents/사진/뿌뿌2.png");
        cbcherry.setSelectedIcon(cherry2);

        cbapple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cbapple.isSelected()){
                    System.out.println("사과를 선택함");
                }
                else {
                    System.out.println("사과를 해제함");
                }
            }
        });

        cbbae.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cbbae.isSelected()){
                    System.out.println("배를 선택했");
                }
                else System.out.println("배를 선택안했");
            }
        });

        cbcherry.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cbcherry.isSelected()){
                    System.out.println("체리 선택됌");
                }
                else System.out.println("체리 선택안");
            }
        });

        con.add(cbapple);
        con.add(cbbae);
        con.add(cbcherry);

        this.setSize(300,300);
        this.setVisible(true);
    }
}
