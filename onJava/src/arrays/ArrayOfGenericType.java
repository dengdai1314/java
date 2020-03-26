package arrays;

/**
 * @Author：等待
 * @Date：2020/2/16 16:50
 * @File：arrays onJava
 */
public class ArrayOfGenericType<T> {
    T[] array;
    public ArrayOfGenericType(int size){
        array=(T[])new Object[size];
    }
}
