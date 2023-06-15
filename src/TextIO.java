// 实验三 第5题

// 实验代码：
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextIO extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    private final JTextField inputField;
    private final JTextArea outputArea;

    public TextIO() {
        setTitle("Input Output GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建输入面板
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputField = new JTextField(10);
        JButton calcButton = new JButton("Calculate");
        calcButton.addActionListener(new CalculateListener());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(calcButton, BorderLayout.EAST);

        // 创建输出面板
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        outputArea = new JTextArea(5, 20);
        outputPanel.add(outputArea, BorderLayout.CENTER);

        // 将输入和输出面板添加到主窗口中
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(outputPanel, BorderLayout.CENTER);
    }

    // 计算按钮的事件监听器
    private class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputText = inputField.getText();
            try {
                float inputNumber = Float.parseFloat(inputText);
                float result = inputNumber * inputNumber;
                String resultText = String.format("%.2f", result); // 格式化结果，保留两位小数
                outputArea.setText("The square of " + inputText + " is " + resultText);
            } catch (NumberFormatException ex) {
                outputArea.setText("Invalid input: " + inputText);
            }
        }
    }

    public static void main(String[] args) {
        TextIO frame = new TextIO();
        frame.setVisible(true);
    }
}
