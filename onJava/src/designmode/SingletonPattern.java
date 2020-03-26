package designmode;
interface Resource {
    int getValue();
    void setValue(int x);
}

final class Singleton{
    private static final class ResourceImpl implements Resource {
        private int i;

        private ResourceImpl(int i){
            this.i = i;
        }
        @Override
        public int getValue() {
            return i;
        }

        @Override
        public void setValue(int x) {
            i = x;
        }
    }

    private static class ResourceHolder{
        private static Resource resource = new ResourceImpl(47);
    }

    public static Resource getResource(){
        return ResourceHolder.resource;
    }
}
public class SingletonPattern {
    public static void main(String[] args) {
        Resource r = Singleton.getResource();
        System.out.println(r.getValue());
        Resource s2 = Singleton.getResource();
        s2.setValue(9);
        System.out.println(r.getValue());
        try {
            // 不能这么做，会发生：compile-time error（编译时错误）.
            // Singleton s3 = (Singleton)s2.clone();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
