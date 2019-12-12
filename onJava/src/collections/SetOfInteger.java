package collections;


import java.util.HashSet;
import java.util.Random;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        HashSet<Integer> intest = new HashSet<>();
        for(int i=1; i<10000; i++){
            intest.add(rand.nextInt(30));
        }
        System.out.println(intest);
    }
}
