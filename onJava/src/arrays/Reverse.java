package arrays;

import java.util.Arrays;
import java.util.Collections;

import static onjava.ArrayShow.show;

/**
 * @Author：等待
 * @Date：2020/2/22 15:03
 * @File：arrays onJava
 */
public class Reverse {
    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        Arrays.setAll(a, n -> CompType.get());
        show("Before sort:",a );
        Arrays.sort(a, Collections.reverseOrder());
        show("after sort",a);
    }
}
