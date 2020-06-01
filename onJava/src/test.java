interface IFlood{
    void eat();
}
class Bread implements IFlood{
    @Override
    public void eat() {
        System.out.println("³ÔÃæ°ü");
    }
}
class Milk implements IFlood{
    @Override
    public void eat() {
        System.out.println("ºÈÅ£ÄÌ");
    }
}
class Factory{
    public static IFlood getInstance(String className){
        if("bread".equals(className)){
            return new Bread();
        }else {
            return new Milk();
        }
    }
}
public class test {
    public static void main(String[] args) {
        IFlood iFlood = Factory.getInstance("bread");
        iFlood.eat();
    }
}

