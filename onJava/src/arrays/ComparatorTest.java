package arrays;

import typeinfo.ShowMethods;

import java.util.Arrays;
import java.util.Comparator;

import static onjava.ArrayShow.*;

/**
 * @Author：等待
 * @Date：2020/2/22 15:23
 * @File：arrays onJava
 */
class ComTypeComparator implements Comparator<CompType>{

    @Override
    public int compare(CompType o1, CompType o2) {
        return  (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        Arrays.setAll(a, n->CompType.get());
        show("before sort",a);
        Arrays.sort(a,new ComTypeComparator());
        show("after sort",a);

    }
}
