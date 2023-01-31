package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortList {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) ints.add(random.nextInt(1000));
        Collections.sort(ints);
        System.out.println("Natural Sorting: "+ints);
        ints.sort((o1,o2) -> {return (o2-o1);});
        System.out.println("Reverse Sorting: "+ints);

    }
}
