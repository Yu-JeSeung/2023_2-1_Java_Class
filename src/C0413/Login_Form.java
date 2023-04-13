package C0413;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Form extends JFrame {
    public Login_Form(){
        this.setTitle("LOGIN FORM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(3,2);
        grid.setVgap(5);

        Container con = getContentPane();
        con.setLayout(grid);
        con.add(new Label("이메일"));
        JTextField txtE = new JTextField();
        con.add(txtE);
        con.add(new Label("비밀번호"));
        JTextField txtP = new JTextField();
        con.add(txtP);

        JButton btnIn = new JButton("로그인");
        JButton btnCan = new JButton("취소");

        con.add(btnIn);
        con.add(btnCan);

        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtE.getText().equals("hong@google.com")&&(txtP.getText().equals("1234"))){
                    System.out.println("로그인 되었습니다.");
                }
                else System.out.println("이메일과 비밀번호를 다시 입력하십시오.");
            }
        });

        btnCan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtE.setText("");
                txtP.setText("");
            }
        });




        this.setSize(350,150);
        this.setVisible(true);
    }
}
