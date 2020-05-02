package innerclasses;

import collections.PrintingCollections;
import sun.security.krb5.internal.PAData;

import javax.naming.InsufficientResourcesException;

/**
 * @Author：等待
 * @Date：2020/4/26 21:17
 * @File：innerclasses onJava
 */
public class Parccel3 {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){label = whereTo;}
        String readLabel(){return label;}
    }

    public static void main(String[] args) {
        Parccel3 parccel3 = new Parccel3();
        Parccel3.Destination d = parccel3.new Destination("test");
        Parccel3.Contents c = parccel3.new Contents();
    }
}
