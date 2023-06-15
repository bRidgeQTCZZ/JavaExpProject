import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvent extends JFrame implements MouseListener, MouseMotionListener {
    JLabel label;
    JPanel panel;

    public MouseEvent() {
        panel = new JPanel();
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);

        label = new JLabel("Mouse events will be displayed here");
        add(panel, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        setTitle("Mouse Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEvent();
    }

    public void mouseClicked(java.awt.event.MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(java.awt.event.MouseEvent e) {
        label.setText("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(java.awt.event.MouseEvent e) {
        label.setText("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(java.awt.event.MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(java.awt.event.MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(java.awt.event.MouseEvent e) {
        label.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(java.awt.event.MouseEvent e) {
        label.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }
}
