package C0413;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JpanelTest extends JFrame {
    JpanelTest(){
        this.setTitle("판넬예제 학번 이름");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        JPanel pan = new JPanel(); // 판넬은 기본적으로 flowLayout 이라 따로 더 안적어 준다.

        JLabel la = new JLabel("아이스크림을 좋아하시나요?");
        JButton btnYes = new JButton("yes");
        JButton btnNo = new JButton("no");

        pan.add(la);
        pan.add(btnYes);
        pan.add(btnNo);
        con.add(pan); // 판에 달아두고 그걸 con 이라는 컨테이너에 다시 추가한다.

        btnYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("예, 아이스크림을 좋아합니다.");
            }
        });
        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("아니오, 아이스크림을 좋아하지 않습니다.");
            }
        });

        this.setSize(350,150);
        this.setVisible(true);
    }
}
