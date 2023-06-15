// 实验四 第2题

// 实验代码：
import java.util.LinkedList;

class Queue {
    private LinkedList<Object> list = new LinkedList<Object>();

    // 入队
    public void enqueue(Object item) {
        list.addLast(item);
    }

    // 出队
    public Object dequeue() {
        return list.removeFirst();
    }

    // 队列是否为空
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // 获取队列大小
    public int size() {
        return list.size();
    }
}

public class MyQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        System.out.println(queue.dequeue()); // 输出：a
        System.out.println(queue.dequeue()); // 输出：b
        System.out.println(queue.isEmpty()); // 输出：false
    }
}

/* 运行结果：
a
b
false
 */

