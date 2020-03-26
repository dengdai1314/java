package arrays;

import onjava.Rand;

import java.util.Arrays;

import static onjava.ArrayShow.show;

/**
 * @Author：等待
 * @Date：2020/2/17 17:31
 * @File：arrays onJava
 */
public class ModifyExisting {
    public static void main(String[] args) {
        double[] da = new double[7];
        Arrays.setAll(da,new Rand.Double()::get);
        show(da);
        Arrays.setAll(da,n->da[n]/100);
        show(da);
    }
}
