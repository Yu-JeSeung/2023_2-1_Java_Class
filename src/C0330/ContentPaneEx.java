package C0330;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    // 생성자만 생성
    public ContentPaneEx(){
        this.setTitle("버튼 추가 화면");
        this.setSize(300,150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 버튼
        Container con = this.getContentPane();
        con.setBackground(Color.ORANGE);
        con.setLayout(new FlowLayout());

        // 버튼 만들기 1
        con.add(new JButton("OK"));

        // 버튼 만들기 2
        JButton hin = new JButton("확인");
        con.add(hin);
        JButton cso = new JButton("취소");
        con.add(cso);

        this.setSize(300,150);
        this.setVisible(true);
    }
}
