package arrays;

import typeinfo.interfacea.A;

import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * @Author：等待
 * @Date：2020/2/15 22:41
 * @File：arrays onJava
 */
public class RaggedArray {
    static int val =1;
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom(47);
        int[][][] a = new int[random.nextInt(7)][][];
        for(int i=0;i<a.length;i++){
            a[i] = new int[random.nextInt(5)][];
            for (int j=0;j<a[i].length;j++){
                a[i][j] = new int[random.nextInt(5)];
                Arrays.setAll(a[i][j], n->val++);
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
