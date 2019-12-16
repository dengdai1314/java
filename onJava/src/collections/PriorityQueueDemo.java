package collections;

import java.util.*;
import java.util.List;

/**
 * @Author：等待
 * @Date：2019/12/15 22:26
 * @File：collections onJava
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random random = new Random(47);
        for(int i=0;i<10;i++){
            priorityQueue.offer(random.nextInt(i+10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20,
                18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(),Collections.reverseOrder());
        priorityQueue.addAll(ints);//必须加，不然得到的是一个空数组
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));//""之间没有空格
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);//新创建，之前是int类型的
        QueueDemo.printQ(stringPQ);

        stringPQ = new PriorityQueue<>(strings.size(),Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> characterSet = new HashSet<>();
        for (char c : fact.toCharArray())
            characterSet.add(c);
        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>(characterSet);
        QueueDemo.printQ(characterPriorityQueue);

    }
}
