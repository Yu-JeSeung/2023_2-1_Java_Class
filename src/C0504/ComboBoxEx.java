package C0504;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxEx extends JFrame {
    ComboBoxEx(){
        this.setTitle("콤보박스 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());

        String [] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
        JComboBox<String> strComboBox = new JComboBox<String>(fruits);

        Integer [] jumsu = {100,200,300,400,500,600,700,800,900};
        JComboBox<Integer> intComboBox = new JComboBox<>();

        for(int i=0;i<jumsu.length;i++){
            intComboBox.addItem(jumsu[i]);
        }
        for(Integer item:jumsu){
            intComboBox.addItem(item);
        }

        strComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selIndex = strComboBox.getSelectedIndex();
                String selItem = (String)strComboBox.getSelectedItem();
                System.out.println(selIndex +" "+ selItem);
            }
        });

        intComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selIndex = intComboBox.getSelectedIndex();
                int selItem = (int)intComboBox.getSelectedItem();
                System.out.println(selIndex +" "+selItem);
            }
        });

        con.add(strComboBox);
        con.add(intComboBox);

        this.setSize(300,300);
        this.setVisible(true);
    }

}
