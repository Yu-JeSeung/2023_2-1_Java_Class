package C0330;

import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        this.setTitle("첫번째 프레임");
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 창을 닫으면 부른 클래스도 같이 종료
    }
}
