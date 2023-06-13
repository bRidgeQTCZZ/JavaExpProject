/* 实验二 第1题 */

// 实验代码：
public class SoftwareNumber {
    private int serialNumber;
    public static int counter = 0;

    public SoftwareNumber() {
        counter++;
        serialNumber = counter;
    }

    public static int getTotalNumber() {
        return counter;
    }

    public static void main(String[] args) {
        SoftwareNumber s1 = new SoftwareNumber();
        System.out.println("s1_number = " + s1.serialNumber);
        SoftwareNumber s2 = new SoftwareNumber();
        System.out.println("s2_number = " + s2.serialNumber);
        SoftwareNumber s3 = new SoftwareNumber();
        System.out.println("s3_number = " + s3.serialNumber);
        SoftwareNumber s4 = new SoftwareNumber();
        System.out.println("s4_number = " + s4.serialNumber);
        SoftwareNumber s5 = new SoftwareNumber();
        System.out.println("s5_number = " + s5.serialNumber);

        System.out.println(getTotalNumber());
    }
}

/* 运行结果：
s1_number = 1
s2_number = 2
s3_number = 3
s4_number = 4
s5_number = 5
5
 */

/* 结果分析：
第5个对象实例生成之后静态变量counter的值是5。
因为counter是类变量成员，多个对象示例共享一个内存区，共享同一个值。
每次执行counter++语句，都会使
 */