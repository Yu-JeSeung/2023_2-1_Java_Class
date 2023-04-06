package C0406;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ex01_Sample extends JFrame {
    ArrayList<Student> stulist = new ArrayList<>();
    public Ex01_Sample(){
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(6,2);
        grid.setVgap(5);

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel("이름"));
        JTextField txtName = new JTextField();
        c.add(txtName);
        c.add(new JLabel("학번"));
        JTextField txtHb = new JTextField();
        c.add(txtHb);
        c.add(new JLabel("학과"));
        JTextField txtHk = new JTextField();
        c.add(txtHk);
        c.add(new JLabel("과목"));
        JTextField txtGm = new JTextField();
        c.add(txtGm);

        // 버튼 만들기 2
        JButton hin = new JButton("확인");
        c.add(hin);
        JButton cso = new JButton("취소");
        c.add(cso);
        JButton show = new JButton("조회");
        c.add(show);

        // 액션 만들기
        hin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String inputName = txtName.getText();
                String inputHb = txtHb.getText();
                String inputHk = txtHk.getText();
                String inputGm = txtGm.getText();
                stulist.add(new Student(inputName,inputHb,inputHk,inputGm));
                System.out.println("확인 버튼을 눌렀습니다."+inputName + inputHb + inputHk + inputGm);
            }
        });

        cso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("취소 버튼을 눌렀습니다.");
                txtName.setText("");
                txtHb.setText("");
                txtHk.setText("");
                txtGm.setText("");
            }
        });

        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Student a:stulist){
                    System.out.println(a);
                }
            }
        });

        setSize(300,200);
        setVisible(true);
    }
}
