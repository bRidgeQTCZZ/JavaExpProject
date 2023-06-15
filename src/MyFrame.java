// 实验三 第1题

// 实验代码：
import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("The Top Frame");
        frame.setSize(1000, 600);
        frame.setLocation(100, 100);
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(new Color(54, 160, 186, 255));

        JLabel northLabel = new JLabel("North Label", new ImageIcon("res/icon_paper.png"), JLabel.CENTER);
        JLabel southLabel = new JLabel("South Label", JLabel.CENTER);
        JLabel eastLabel = new JLabel("East Label");
        JLabel westLabel = new JLabel("West Label");

        northLabel.setOpaque(true);
        northLabel.setBackground(Color.BLUE);

        northLabel.setForeground(Color.YELLOW);
        southLabel.setForeground(Color.BLUE);
        eastLabel.setForeground(Color.ORANGE);
        westLabel.setForeground(Color.PINK);

        northLabel.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        southLabel.setFont(new Font(Font.DIALOG, Font.ITALIC, 15));

        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(westLabel, BorderLayout.WEST);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(80, 100));
        panel.setBackground(Color.GRAY);
        frame.add(panel, BorderLayout.CENTER);

        JButton northButton = new JButton("North Button");
        JButton southButton = new JButton("South Button");
        JButton eastButton = new JButton("East Button");
        JButton westButton = new JButton("West Button");
        JButton centerButton = new JButton("Center Button");

        northButton.setBackground(new Color(0, 50, 250));
        southButton.setBackground(new Color(250, 200, 0));
        eastButton.setBackground(new Color(0, 250, 200));
        westButton.setBackground(new Color(50, 250, 0));

        northButton.setForeground(new Color(100, 150, 200));
        southButton.setForeground(new Color(150, 100, 200));
        eastButton.setForeground(new Color(100, 200, 150));
        westButton.setForeground(new Color(150, 200, 100));

        eastButton.setIcon(new ImageIcon("res/icon_gps.png"));
        westButton.setIcon(new ImageIcon("res/icon_phone.png"));
        centerButton.setFont(new Font("Times New Roman", Font.ITALIC, 18));

        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(centerButton, BorderLayout.CENTER);
        panel.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
