package Z2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Z2 {

    public static <E extends Iterable<?>> void wypiszCoDrugi(E element){
        Iterator<?> iterator = element.iterator();
        System.out.println(iterator.next() + ", ");
        while (iterator.hasNext()){
            iterator.next();
            if (iterator.hasNext()){
                System.out.println(iterator.next() + ", ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> testInt = new ArrayList<>();
        testInt.add(1);
        testInt.add(2);
        testInt.add(3);
        testInt.add(4);
        testInt.add(5);

        HashSet<Integer> testHS = new HashSet<>(testInt);

        TreeSet<Integer> testTree = new TreeSet<>(testHS);

        wypiszCoDrugi(testInt);
        wypiszCoDrugi(testHS);
        wypiszCoDrugi(testTree);
    }
}
