// 实验三 第3题

// 实验代码：

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorChooser {
    public void init() {
        JFrame frame = new JFrame("ColorChooser");
        frame.setSize(300, 200);
        frame.setLocation(300, 300);

        JLabel label = new JLabel("HELLO WORLD!", JLabel.CENTER);
        label.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

        JLabel l1 = new JLabel("Choose the color of frame:");
        JLabel l2 = new JLabel("Choose the color of label:");

        JButton chooseFrameBackColor = new JButton("Background");
        JButton chooseFrameForeColor = new JButton("Foreground");
        JButton chooseLabelBackColor = new JButton("Background");
        JButton chooseLabelForeColor = new JButton("Foreground");

        JPanel panel = new JPanel();

        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;

        gbc.weighty = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(panel, l1, gbl, gbc);

        gbc.weightx = 1;
        gbc.gridwidth = 1;
        addComponent(panel, chooseFrameBackColor, gbl, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(panel, chooseFrameForeColor, gbl, gbc);

        addComponent(panel, l2, gbl, gbc);

        gbc.weightx = 1;
        gbc.gridwidth = 1;
        addComponent(panel, chooseLabelBackColor, gbl, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(panel, chooseLabelForeColor, gbl, gbc);

        frame.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        chooseFrameBackColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Choose a color", Color.WHITE);
                frame.setBackground(color);
            }
        });

        chooseFrameForeColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Choose a color", Color.WHITE);
                frame.setBackground(color);
            }
        });

        chooseLabelBackColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(label, "Choose a color", Color.WHITE);
                label.setBackground(color);
            }
        });

        chooseLabelForeColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(label, "Choose a color", Color.WHITE);
                label.setBackground(color);
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void addComponent(Container container, Component c, GridBagLayout gridBagLayout, GridBagConstraints gridBagConstraints) {
        gridBagLayout.setConstraints(c, gridBagConstraints);
        container.add(c);
    }

    public static void main(String[] args) {
        new MyColorChooser().init();
    }
}
