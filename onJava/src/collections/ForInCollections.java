package collections;

import java.util.*;

public class ForInCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs,"take me along".split(" "));
        for(String s :cs){
            System.out.println(" "+s+" ");
        }
    }
}
