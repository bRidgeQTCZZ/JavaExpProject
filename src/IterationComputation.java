// 实验二 第4题

// 实验代码：
import java.util.Scanner;

public class IterationComputation {
    public float iterationMethodOfNewton(float a, float x0, float z) {
        float x1 = (x0 + a / x0) / 2;
        while(Math.abs(x1 - x0) >= z) {
            x1 = (x1 + a / x1) / 2;
        }
        return x1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        IterationComputation ic = new IterationComputation();
        System.out.println(ic.iterationMethodOfNewton(a, a / 2, 0.0000001f));
    }
}

/* 运行结果：
10
10
1.1
 */