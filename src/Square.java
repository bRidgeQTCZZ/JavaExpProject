// 实验二 第2题

// 实验代码
public class Square {
    double edgeLength; // 边长
    double area; // 面积

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    public double getEdgeLength() {
        return edgeLength;
    }
    public void setArea() {
        this.area = edgeLength * edgeLength;
    }
    public double getArea() {
        return area;
    }

    public String toString() {
        return "这是一个边长为" + edgeLength + "，面积为" + area + "的正方形";
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.setEdgeLength(2);
        s.setArea();
        System.out.println("获取边长：" + s.getEdgeLength());
        System.out.println("获取面积：" + s.getArea());
        System.out.println(s);
    }
}

/* 运行结果

 */