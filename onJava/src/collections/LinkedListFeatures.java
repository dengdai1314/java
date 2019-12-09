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
        System.out.println("pets.getFirst():"+pets.getFirst());
        System.out.println("pets.element():"+pets.element());
        System.out.println("pets.peek():"+pets.peek());
        System.out.println("pets.remove():"+pets.remove());
        System.out.println("pets.removeFrist():"+pets.removeFirst());
        System.out.println("pets.poll():"+pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst():"+pets);
        pets.offer(Pets.get());
        System.out.println("After offer(): " + pets);
        pets.add(Pets.get());
        System.out.println("After add(): " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast(): " + pets);
        System.out.println(
                "pets.removeLast(): " + pets.removeLast());
    }
}
