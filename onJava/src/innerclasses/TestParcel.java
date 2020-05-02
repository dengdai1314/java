package innerclasses;

import sun.security.krb5.internal.crypto.Des;

/**
 * @Author：等待
 * @Date：2020/4/26 21:26
 * @File：innerclasses onJava
 */
class Parcel4 {
    private class PContents implements Contents{
        private int value = 11;
        @Override
        public int value() {
            return value;
        }
    }
    protected class PDestination implements Destination{
        private  String label;
        private PDestination(String whereTo){
            label  = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return  new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}
class TestParcel{
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();

        Contents c = p.contents();
        Destination d = p.destination("test");
        // Illegal -- can't access private class:
        //- Parcel4.PContents pc = p.new PContents();
    }
}
