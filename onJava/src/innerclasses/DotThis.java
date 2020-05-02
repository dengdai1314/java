package innerclasses;

/**
 * @Author：等待
 * @Date：2020/4/26 21:10
 * @File：innerclasses onJava
 */
public class DotThis {
    void f(){System.out.println("DotThis.f()");}
    public class  Inner{
        public DotThis outter(){
            return DotThis.this;
        }
    }

    public Inner inner(){return new Inner();}

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outter().f();
    }
}
