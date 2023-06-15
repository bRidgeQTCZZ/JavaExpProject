// 实验四 第1题

// 实验代码：
import java.util.LinkedList;

class Stack<E> {
    private final LinkedList<E> list = new LinkedList<>();

    public void push(E e) {
        list.addLast(e);
    }

    public E pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeLast();
    }

    public E peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

/* 运行结果：
C
B
A
 */