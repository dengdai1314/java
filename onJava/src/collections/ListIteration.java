package collections;

import typeinfo.pets.*;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        System.out.println(pets);
        ListIterator<Pet> it = pets.listIterator();
        System.out.println(it);
        while (it.hasNext()){
            System.out.print(it.next()+","+it.nextIndex()+","+it.previousIndex()+"; ");
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.print(it.previous().id()+" ");
        }
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set(Pets.get());
        }
        System.out.println(pets);
    }
}
