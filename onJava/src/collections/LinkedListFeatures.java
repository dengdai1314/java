package collections;

import onjava.Rand;
import typeinfo.pets.*;
import java.util.*;

/**
 * @Author：等待
 * @Date：2019/12/9 23:08
 * @File：collections onJava
 */
public class LinkedListFeatures {
    public static void main(Rand.String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.list(5));
        System.out.println(pets);
        System.out.println("pets.getFirst():"+pets.getFirst());//返回头部第一个元素而不删除
        System.out.println("pets.element():"+pets.element());//返回头部第一个元素而不删除
        System.out.println("pets.peek():"+pets.peek());//返回头部第一个元素而不删除
        System.out.println("pets.remove():"+pets.remove());//删除并返回列表的头部元素
        System.out.println("pets.removeFrist():"+pets.removeFirst());//删除并返回列表的头部元素
        System.out.println("pets.poll():"+pets.poll());//删除并返回列表的头部元素
        System.out.println(pets);
        pets.addFirst(new Rat());//在列表的开头添加一个元素
        System.out.println("After addFirst():"+pets);
        pets.offer(Pets.get());//在列表尾部添加一个元素
        System.out.println("After offer(): " + pets);
        pets.add(Pets.get());//在列表尾部添加一个元素
        System.out.println("After add(): " + pets);
        pets.addLast(new Hamster());//在列表尾部添加一个元素
        System.out.println("After addLast(): " + pets);
        System.out.println(
                "pets.removeLast(): " + pets.removeLast());//删除并返回列表的最后一个元素
    }
}
