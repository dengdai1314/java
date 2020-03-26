package arrays;

import onjava.Rand;

import java.util.Arrays;
import java.util.Collections;

import static onjava.ArrayShow.show;

/**
 * @Author：等待
 * @Date：2020/2/22 15:35
 * @File：arrays onJava
 */
public class StringSorting {
    public static void main(String[] args) {
        String[] sa = new Rand.String().array(20);
        show("befor sort",sa);
        Arrays.sort(sa);
        show("After sort", sa);
        Arrays.sort(sa, Collections.reverseOrder());
        show("Reverse sort", sa);
        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        show("Case-insensitive sort", sa);
    }
}
