// 实验三 第4题

// 实验代码：
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFileChooser {
    public static void main(String[] args) {
        // 创建文件选择器
        JFileChooser fileChooser = new JFileChooser();

        // 设置文件过滤器，只允许选择txt文件
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooser.setFileFilter(filter);

        // 弹出打开文件对话框，返回值表示用户操作的结果
        int openResult = fileChooser.showOpenDialog(new JFrame());
        if (openResult == JFileChooser.APPROVE_OPTION) {
            // 用户点击了“打开”按钮，获取选择的文件路径并输出
            String filePath = fileChooser.getSelectedFile().getPath();
            System.out.println("Open file path: " + filePath);
        }

        // 弹出保存文件对话框，返回值表示用户操作的结果
        int saveResult = fileChooser.showSaveDialog(new JFrame());
        if (saveResult == JFileChooser.APPROVE_OPTION) {
            // 用户点击了“保存”按钮，获取选择的文件路径并输出
            String filePath = fileChooser.getSelectedFile().getPath();
            System.out.println("Save file path: " + filePath);
        }
    }
}