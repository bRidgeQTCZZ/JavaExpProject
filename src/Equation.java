// 实验一 第4题

// 实验代码；
public class Equation {
    public static void main(String[] args) {
        for (int i = 1; i <= 105; i++) {
            if (i % 3 == 2 && i % 5 == 3 && i % 7 == 2) {
                System.out.println(i);
            }
        }
    }
}

/* 运行结果：
23
 */