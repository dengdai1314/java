package innerclasses;

/**
 * @Author：等待
 * @Date：2020/4/26 22:10
 * @File：innerclasses onJava
 * 在任意作用域内嵌入一个内部类,在定义 Trackingslip 的作用域之外，它是不可用的，除此之外，它与普通的类一样。
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){return id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // Can't use it here! Out of scope:
        //- TrackingSlip ts = new TrackingSlip("x");
    }

    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
