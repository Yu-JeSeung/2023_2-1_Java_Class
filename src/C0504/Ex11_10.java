package C0504;

import javax.swing.*;
import java.awt.*;

public class Ex11_10 extends JFrame {
    Ex11_10(){
        this.setTitle("리스트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());

        String [] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
        JList<String> strList = new JList<String>(fruits);
        con.add((strList));

        Integer [] jumsu = {100,200,300,400,500,600,700,800,900};
        JList<Integer> intList = new JList<Integer>(jumsu);
        con.add(intList);

        this.setSize(300,300);
        this.setVisible(true);
    }
}
