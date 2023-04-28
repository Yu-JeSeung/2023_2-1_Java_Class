package C0427;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {
    TextAreaEx(){this.setTitle("텍스트 영역 만들기 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());

        con.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));

        JTextField tf = new JTextField(20);
        con.add(tf);

        JTextArea ta = new JTextArea(7,20);
        con.add(new JScrollPane(ta));

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append(tf.getText()+"\n");
                tf.setText("");
            }
        });




        this.setSize(300,300);
        this.setVisible(true);
    }
}
