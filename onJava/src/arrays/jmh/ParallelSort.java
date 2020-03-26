package arrays.jmh;

import onjava.Rand;

import java.util.Arrays;

/**
 * @Author：等待
 * @Date：2020/2/22 17:21
 * @File：arrays.jmh onJava
 */
public class ParallelSort {
    private long[] la;

    public void setup() {
        la = new Rand.Plong().array(100_000);
    }

    public void sort() {
        Arrays.sort(la);
    }

    public void parallelSort() {
        Arrays.parallelSort(la);
    }
}
