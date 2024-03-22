package lec4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySetTest {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);

        //[1,1,1,1] length = 4;
        //set.size = 1;

        System.out.println("HashSet: " + hashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(90);
        treeSet.add(100);
        treeSet.add(Integer.MIN_VALUE);
        treeSet.add(0);

        System.out.println("TreeSet: " + treeSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(91);
        linkedHashSet.add(101);
        linkedHashSet.add(Integer.MAX_VALUE);
        linkedHashSet.add(1);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        hashSet.addAll(linkedHashSet);
        System.out.println("After hashSet.addAll(linkedHashSet): " + hashSet);

        hashSet.retainAll(linkedHashSet);
        System.out.println("After hashSet.retainAll(linkedHashSet): " + hashSet);

    }
}
