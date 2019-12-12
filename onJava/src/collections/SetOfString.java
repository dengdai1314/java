package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetOfString {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        for(int i=1;i<1000;i++){
            colors.add("red");
            colors.add("blue");
            colors.add("blue");
            colors.add("yellow");
            colors.add("orange");
            colors.add("red");
            colors.add("blue");
            colors.add("blue");
            colors.add("yellow");
            colors.add("orange");
            colors.add("purple");
        }
        System.out.println(colors);
    }
}
