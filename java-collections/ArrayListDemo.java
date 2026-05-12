
import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            arr.add(i, i*i);
        }

        // arr.get(1); - didnt print anything
        // System.out.println(" ");

        // arr.add(1, 99); - added 99 at index 1 
        // System.out.println(" ");
        // arr.remove(Integer.valueOf(9)); - removed the element with value 9
        // System.out.println(" ");
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(" ");

        // System.out.println(arr.get(100)); - Index 100 out of bounds for length 10
        // arr.remove(1);
        // for(int i = 0; i < arr.size(); i++){
        //     System.out.print(arr.get(i) + " ");
        // }
    }
}