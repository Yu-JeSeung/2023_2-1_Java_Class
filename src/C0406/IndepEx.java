package C0406;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepEx extends JFrame {
    public IndepEx(){
        this.setTitle("이벤트 리스너 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.setBackground(Color.YELLOW);

        JButton btn = new JButton("Action");
        MyActionListener lis = new MyActionListener();
        btn.addActionListener(lis); // 버튼 눌렀을 때 바뀌는 것을 위해 추가 (방법 1)
        con.add(btn);

        this.setSize(350,150);
        this.setVisible(true);
    }
}

// 액션 박스를 바꾸기 위한 새로운 class 내용 읽고 다시 짜보기 (방법 1)
class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        System.out.println(b);
        if (b.getText().equals("Action"))
        {
            b.setText("액션");
        }
        else
            b.setText("Action");
    }
}
