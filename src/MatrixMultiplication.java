// 实验一 第3题

// 实验代码：

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] b = new int[4][5];
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                a[j][i] = input.nextInt();
            }
        }
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                b[j][i] = input.nextInt();
            }
        }
        int[][] ans = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int sum = 0;
                for (int k = 0; k < a[0].length; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
                ans[i][j] = sum;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* 运行结果：
Input:
1 2 3 4
1 1 1 1
2 2 2 2
1 1 1 1 1
1 2 3 4 5
1 2 3 4 5
-1 -1 -1 -1 -1
0 0 0 0 0

Output:
17 22 0 3 6
8 10 1 3 5
9 11 2 5 8
 */