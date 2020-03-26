package arrays;

import onjava.Rand;

import java.util.Arrays;

import static onjava.ArrayShow.show;

/**
 * @Author：等待
 * @Date：2020/2/23 18:46
 * @File：arrays onJava
 */
public class ParallelPrefix2 {
    public static void main(String[] args) {
        String[] strings = new Rand.String(1).array(8);
        show(strings);
        Arrays.parallelPrefix(strings, (a, b) -> a + b);
        show(strings);
    }
}
