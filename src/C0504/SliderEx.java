package C0504;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
    SliderEx(){
        this.setTitle("슬라이더 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);

        con.add(slider);

        this.setSize(300,300);
        this.setVisible(true);
    }
}
