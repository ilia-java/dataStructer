package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayasSet {
    public static void main(String[] args) {
        String[] sedaDar = {"a","e","i","o","u"};
        Set<String> sedaDarSet = new HashSet<>(Arrays.asList(sedaDar));
        System.out.println(sedaDarSet);

        sedaDarSet.remove("u");
        System.out.println(sedaDarSet);

        sedaDarSet.clear();
        System.out.println(sedaDarSet);


        //در این پیاده سازی از Array.asList استفاده نمیشود
        String[] sedaDar2 = {"a","e","i","o","u","u"};
        Set<String> sedaDarSet2 = new HashSet<>();
        Collections.addAll(sedaDarSet2, sedaDar2);
        System.out.println(sedaDarSet2);

        sedaDarSet2.iterator();
        System.out.println(sedaDarSet2);

        sedaDarSet2.removeAll(sedaDarSet2);//این عملا با متد clearبک نتیحه را به تو میدهند وابسته به کاربرد خودت باید استفاده کنی
        System.out.println(sedaDarSet2);

    }
}
