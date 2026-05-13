import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(50, "a");
        map.put(58, "b");
        map.put(54, "c");

        System.out.println(map); // sorted output
        map.put(50, "s");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.higherKey(50));
        System.out.println(map.lowerKey(58));
        
        map.higherKey(50);
        map.lowerKey(50);
    }
}
