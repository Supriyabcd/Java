import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < 10; i++){
            list.add(i, i*i);
        }

        // list.get(1); //- didnt print anything
        // System.out.println(" ");

        // list.add(1, 99); //- added 99 at index 1 
        // System.out.println(" ");
        // list.remove(Integer.valueOf(9)); //- removed the element with value 9
        // System.out.println(" ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");

        // System.out.println(list.get(100)); //- Index 100 out of bounds for length 10
        // list.remove(1);
        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }
    }
}
