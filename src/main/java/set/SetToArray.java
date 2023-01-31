package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SetToArray {
    public static void main(String[] args) {
        Set<String> sedaDarSet = new HashSet<>();
        sedaDarSet.add("a");
        sedaDarSet.add("e");
        sedaDarSet.add("i");
        sedaDarSet.add("o");
        sedaDarSet.add("u");
        String strArray[] = sedaDarSet.toArray(new String[sedaDarSet.size()]);
        System.out.println(Arrays.toString(strArray));
    }
}

