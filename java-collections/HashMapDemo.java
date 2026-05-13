
import java.util.*;


class Student{
    int id;

    Student(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class HashMapDemo extends HashMap{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 100);
        map.put("AB", 203);
        System.out.println(map);

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        
        map.put("AB", 99);

        System.out.println(map);

        // map.remove("A");
        // System.out.println(map);

        for(String key : map.keySet()){ //loops over keys, calls map.get(key) for each value 
            System.out.println(key + " " + map.get(key));
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){ //loops over Map.Entry objects, gets key+value in one go 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        }

        HashMap<Student, String> stuMap = new HashMap<>();
        stuMap.put(new Student(1), "Rahul");
        System.out.println(stuMap.get(new Student(1)));
    }
}
