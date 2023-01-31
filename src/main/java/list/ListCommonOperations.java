package list;

import java.util.ArrayList;
import java.util.List;

public class ListCommonOperations {
    public static void main(String[] args) {
        List<String> vowels= new ArrayList();
        vowels.add("A");
        vowels.add("I");
        vowels.add(1,"E");
        System.out.println(vowels);

        List<String> list = new ArrayList();
        list.add("O");
        list.add("U");
        vowels.addAll(list);
        System.out.println(vowels);

     list.clear();
        System.out.println("letters list size = "+vowels.size());

        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        list = vowels.subList(0, 3);
        System.out.println("letters = "+vowels+", list = "+list);
    }
}
