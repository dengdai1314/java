package arrays;

import typeinfo.interfacea.A;

import java.util.*;

/**
 * @Author：等待
 * @Date：2020/2/15 22:11
 * @File：arrays onJava
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        //数组赋值
        int[][] a = {{1,2,3},{4,5,6}};

//        int[][] a = new int[2][3];
//        a[0][0]=1;

//        int[][] a = new int[][]{{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(a));
    }
}
