package arrays;

import onjava.Count;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static onjava.ArrayShow.show;

/**
 * @Author：等待
 * @Date：2020/2/16 21:08
 * @File：arrays onJava
 */
public class TestCount {
    static final int SZ = 5;
    public static void main(String[] args) {
        System.out.println("Boolean");
        Boolean[] a1 = new Boolean[SZ];
        Arrays.setAll(a1, new Count.Boolean()::get);
        show(a1);
        a1 = Stream.generate(new Count.Boolean())
                .limit(SZ + 1).toArray(Boolean[]::new);
        show(a1);
        a1 = new Count.Boolean().array(SZ + 2);
        show(a1);
        boolean[] a1b =
                new Count.Pboolean().array(SZ + 3);
        show(a1b);

        System.out.println("Byte");
        Byte[] a2 = new Byte[SZ];
        Arrays.setAll(a2, new Count.Byte()::get);
        show(a2);
        a2 = Stream.generate(new Count.Byte())
                .limit(SZ + 1).toArray(Byte[]::new);
        show(a2);
        a2 = new Count.Byte().array(SZ + 2);
        show(a2);
        byte[] a2b = new Count.Pbyte().array(SZ + 3);
        show(a2b);

        System.out.println("Character");
        Character[] a3 = new Character[SZ];
        Arrays.setAll(a3, new Count.Character()::get);
        show(a3);
        a3 = Stream.generate(new Count.Character())
                .limit(SZ + 1).toArray(Character[]::new);
        show(a3);
        a3 = new Count.Character().array(SZ + 2);
        show(a3);
        char[] a3b = new Count.Pchar().array(SZ + 3);
        show(a3b);

        System.out.println("Short");
        Short[] a4 = new Short[SZ];
        Arrays.setAll(a4, new Count.Short()::get);
        show(a4);
        a4 = Stream.generate(new Count.Short())
                .limit(SZ + 1).toArray(Short[]::new);
        show(a4);
        a4 = new Count.Short().array(SZ + 2);
        show(a4);
        short[] a4b = new Count.Pshort().array(SZ + 3);
        show(a4b);

        System.out.println("Integer");
        int[] a5 = new int[SZ];
        Arrays.setAll(a5, new Count.Integer()::get);
        show(a5);
        Integer[] a5b =
                Stream.generate(new Count.Integer())
                        .limit(SZ + 1).toArray(Integer[]::new);
        show(a5b);
        a5b = new Count.Integer().array(SZ + 2);
        show(a5b);
        a5 = IntStream.generate(new Count.Pint())
                .limit(SZ + 1).toArray();
        show(a5);
        a5 = new Count.Pint().array(SZ + 3);
        show(a5);

        System.out.println("Long");
        long[] a6 = new long[SZ];
        Arrays.setAll(a6, new Count.Long()::get);
        show(a6);
        Long[] a6b = Stream.generate(new Count.Long())
                .limit(SZ + 1).toArray(Long[]::new);
        show(a6b);
        a6b = new Count.Long().array(SZ + 2);
        show(a6b);
        a6 = LongStream.generate(new Count.Plong())
                .limit(SZ + 1).toArray();
        show(a6);
        a6 = new Count.Plong().array(SZ + 3);
        show(a6);

        System.out.println("Float");
        Float[] a7 = new Float[SZ];
        Arrays.setAll(a7, new Count.Float()::get);
        show(a7);
        a7 = Stream.generate(new Count.Float())
                .limit(SZ + 1).toArray(Float[]::new);
        show(a7);
        a7 = new Count.Float().array(SZ + 2);
        show(a7);
        float[] a7b = new Count.Pfloat().array(SZ + 3);
        show(a7b);

        System.out.println("Double");
        double[] a8 = new double[SZ];
        Arrays.setAll(a8, new Count.Double()::get);
        show(a8);
        Double[] a8b =
                Stream.generate(new Count.Double())
                        .limit(SZ + 1).toArray(Double[]::new);
        show(a8b);
        a8b = new Count.Double().array(SZ + 2);
        show(a8b);
        a8 = DoubleStream.generate(new Count.Pdouble())
                .limit(SZ + 1).toArray();
        show(a8);
        a8 = new Count.Pdouble().array(SZ + 3);
        show(a8);
    }
}
