import java.util.Scanner;

public class IntegerSequence implements IntegerSequenceProcessing{
    public int[] nums;

    IntegerSequence() {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入数列长度：");
        int len = s.nextInt();
        System.out.print("请输入一个长度为" + len + "的数列：");
        nums = new int[len];
        for(int i = 0; i < len; i++) {
            nums[i] = s.nextInt();
        }
    }

    public int[] getNums() {
        return nums;
    }

    public boolean isArithmeticSequence(int[] sequence) {
        int d = sequence[1] - sequence[0];
        for(int i = 1; i < sequence.length; i++) {
            if(sequence[i] - sequence[i - 1] != d) {
                return false;
            }
        }
        return true;
    }

    public boolean isGeometricSequence(int[] sequence) {
        double q = (double) sequence[1] / sequence[0];
        for(int i = 1; i < sequence.length; i++) {
            if((double) sequence[i] / sequence[i - 1] != q) {
                return false;
            }
        }
        return true;
    }

    public boolean isFibonacciSequence(int[] sequence) {
        if(sequence[0] != 1 || sequence[1] != 1)
            return false;
        for(int i = 2; i < sequence.length; i++) {
            if(sequence[i] != sequence[i - 1] + sequence[i - 2])
                return false;
        }
        return true;
    }

    public static String trueOrFalse(boolean b) {
        if(b) {
            return "是";
        }
        else {
            return "不是";
        }
    }

    public static void main(String[] args) {
        IntegerSequence Sequence = new IntegerSequence();
        System.out.println("这" + trueOrFalse(Sequence.isArithmeticSequence(Sequence.getNums())) + "一个等差数列。");
        System.out.println("这" + trueOrFalse(Sequence.isGeometricSequence(Sequence.getNums())) + "一个等比数列。");
        System.out.println("这" + trueOrFalse(Sequence.isFibonacciSequence(Sequence.getNums())) + "一个斐波那契数列。");
    }
}
