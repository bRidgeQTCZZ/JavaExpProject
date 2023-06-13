// 实验一 第2题

// 实验代码：
import java.util.Scanner;

public class IterativeSqrt {
    public static void main(String[] args) {
        double a, z;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个正数（被平方根数）：");
        a = input.nextDouble();
        System.out.print("请输入临界值：");
        z = input.nextDouble();
        double x = a / 2.0;
        double answer = circle(x, a);
        while (Math.abs(answer - x) >= z) {
            x = answer;
            answer = circle(x, a);
        }
        System.out.println(answer);
    }

    public static double circle(double x, double a) {
        return (x + a / x) / 2.0;
    }
}

/* 运行结果：
（1）
请输入一个正数（被平方根数）：10
请输入临界值：0.001
3.1622776604441363

（2）
请输入一个正数（被平方根数）：16
请输入临界值：0.00001
4.000000000000004
 */