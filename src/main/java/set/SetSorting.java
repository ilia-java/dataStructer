package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {
    public static void main(String[] args) {
        Set<Integer> intsSet = new HashSet<>();
    intsSet.add(276);
    intsSet.add(981);
    intsSet.add(2009);
    intsSet.add(87);
    intsSet.add(8092);
    intsSet.add(212);
        System.out.println(intsSet);
        Set<Integer>sotredSet=new TreeSet<>(intsSet);
        System.out.println(sotredSet);

    }
}
