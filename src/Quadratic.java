// 实验一 第1题

// 实验代码：
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double answer1 = (-b + Math.sqrt(delta)) / 2.0 * a;
            double answer2 = (-b - Math.sqrt(delta)) / 2.0 * a;
            System.out.println(answer1 + " " + answer2);
        } else if (delta == 0) {
            double answer = (-b) / 2.0 * a;
            System.out.println(answer);
        } else {
            System.out.println("No Real Roots");
        }
    }
}

/* 运行结果：
（1）
1 -2 1
1.0

（2）
1 -4 3
3.0 1.0

（3）
1 0 1
No Real Roots
 */