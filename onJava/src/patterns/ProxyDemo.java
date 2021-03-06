package patterns;

/**
 * @Author：等待
 * @Date：2020/3/22 22:57
 * @File：patterns onJava
 */
interface ProxyBase{
    void f();
    void g();
    void h();
}
class Proxy implements ProxyBase {
    private ProxyBase implementation;

    Proxy() {
        implementation = new Implementation();
    }
    // Pass method calls to the implementation:
    @Override
    public void f() { implementation.f(); }
    @Override
    public void g() { implementation.g(); }
    @Override
    public void h() { implementation.h(); }
}

class Implementation implements ProxyBase{

    @Override
    public void f() {
        System.out.println("Implementation.f()");
    }

    @Override
    public void g() {
        System.out.println("Implementation.g()");
    }

    @Override
    public void h() {
        System.out.println("Implementation.h()");
    }
}

public class ProxyDemo{
    public static void main(String[] args) {
        Proxy p = new Proxy();
        p.f();
        p.g();
        p.h();
    }
}