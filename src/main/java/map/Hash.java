package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//مدل های پیاده سازی HashMap
//    Map<String, String> map1 = new HashMap<>();
//
//    Map<String, String> map2 = new HashMap<>(2^5);
//
//    Map<String, String> map3 = new HashMap<>(32,0.80f);
//
//    Map<String,String> map4 = new HashMap<>(map1);

public class Hash {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", null);
        map.put(null, "100");
        String value = map.get("4");
        System.out.println("Key = 3, Value = " + value);

        boolean keyExists = map.containsKey(null);
        boolean valueExists = map.containsValue("1000");
        System.out.println("keyExists=" + keyExists + ", valueExists=" + valueExists);

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        System.out.println("map size=" + map.size());

        Map<String, String> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println("map1 mappings= " + map1);

        String nullKeyValue = map1.remove(null);
        System.out.println("map1 after removing null key = " + map1);

        Set<String> keySet = map.keySet();
        System.out.println("map keys = " + keySet);

        Collection<String> values = map.values();
        System.out.println("map values = " + values);

        map.clear();
        System.out.println("map is empty=" + map.isEmpty());




    }
}