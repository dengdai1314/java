package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random();
        for(int i=0;i<10;i++){
            queue.offer(rand.nextInt(i+10));
        }
        System.out.println(queue);
        Queue<Character> characterQueue = new LinkedList<>();
        for (char c:"characterQueue".toCharArray()){
            characterQueue.offer(c);
        }
        System.out.println(characterQueue);
    }
}
