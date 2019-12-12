package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for (String s : "This is my world".split(" ")){
            stack.push(s);//从头开始添加，后进先出
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
