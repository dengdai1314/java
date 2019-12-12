package collections;
import  java.util.*;
public class StackTest2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "This is my world".split(" ")){
            stack.push(s);//从头开始添加，后进先出
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
