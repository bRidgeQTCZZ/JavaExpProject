// 实验三 第2题

// 实验代码：

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MySlider {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input With Slider");
        frame.setSize(450, 200);
        frame.setLocation(300, 300);

        JPanel jp0 = new JPanel();
        frame.add(jp0, BorderLayout.WEST);

        JLabel JLNumber = new JLabel("number");

        JTextArea textArea0 = new JTextArea("0");
        textArea0.setEditable(false);

        JSlider slider0 = new JSlider(0, 100, 0);

        jp0.setLayout(new GridLayout(3, 1));
        jp0.add(JLNumber);
        jp0.add(textArea0);
        jp0.add(slider0);

        ChangeListener lis0 = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int num = slider0.getValue();
                textArea0.setText(String.valueOf(num));
            }
        };

        slider0.addChangeListener(lis0);

        JPanel jp1 = new JPanel();
        frame.add(jp1, BorderLayout.EAST);

        JLabel jLColor = new JLabel("color");

        JTextArea textArea1 = new JTextArea("(127, 127, 127)");
        textArea1.setBackground(new Color(127, 127, 127));

        JSlider sliderR = new JSlider(0, 255, 127);
        JSlider sliderG = new JSlider(0, 255, 127);
        JSlider sliderB = new JSlider(0, 255, 127);

        jp1.setLayout(new GridLayout(5, 1));
        jp1.add(jLColor);
        jp1.add(textArea1);
        jp1.add(sliderR);
        jp1.add(sliderG);
        jp1.add(sliderB);

        ChangeListener colorChooserRGB = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int r = sliderR.getValue();
                int g = sliderG.getValue();
                int b = sliderB.getValue();
                textArea1.setText("(" + r + ", " + g + ", " + b + ")");
                textArea1.setBackground(new Color(r, g, b));
            }
        };

        sliderR.addChangeListener(colorChooserRGB);
        sliderG.addChangeListener(colorChooserRGB);
        sliderB.addChangeListener(colorChooserRGB);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
