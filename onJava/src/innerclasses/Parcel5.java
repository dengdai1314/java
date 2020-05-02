package innerclasses;

/**
 * @Author：等待
 * @Date：2020/4/26 21:53
 * @File：innerclasses onJava
 * 在方法的作用域内（而不是在其他类的作用域内）创建一个完整的类，这被称作局部内部类
 */
public class Parcel5 {
    public Destination destination(String s){
        final class PDestination implements  Destination{
            private String label;
            private PDestination (String whereTo){
                label = whereTo;
            }
            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("test");
    }
}
