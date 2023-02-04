package lambda;

import javax.swing.*;
import java.util.*;


public class Main implements Runnable {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Joe", "Jack", "James", "Albert");
//        for (String name: names) {
//            System.out.println(name);
//        }
        names.forEach(System.out::println);

        List<Integer> temps = Arrays.asList(110, 115, 105, 99, 98, 54, 109, 84, 81, 66, 72, 135, 115, 75, 82, 90, 88);
        Comparator<Integer> cmpTemp = (x, y) -> Integer.compare(x, y);
        System.out.println("------ Max/Min ------");
        System.out.println(Collections.max(temps, cmpTemp) + "/" + Collections.min(temps, cmpTemp));

        JButton button = new JButton("Click Me");
        button.addActionListener(e -> System.out.println("Button clicked!"));


        Map<String, Integer> map = new HashMap<>();
        map.put("Atlanta, Georgia", 110);
        map.put("Austin, Texas", 115);
        map.put("Baltimore, Maryland", 105);
        map.put("Birmingham, Alabama", 99);
        map.put("Boston, Massachusetts", 98);
//        for (Map.Entry<String,Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + " => " + e.getValue());}
        map.forEach((k, v) -> System.out.println(k + " => " + v));

//        Main task = new Main();
//        Thread thread = new Thread(task);
//        thread.start();
        Runnable task = () -> System.out.println("Running in a separate thread now.");
    }

    @Override
    public void run() {
        System.out.println("Running in a separate thread now.");
    }

}
