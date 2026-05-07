// import java.util.Scanner;

class Student{
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }

    void introduce(){
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
    }
}

class NewStudent extends Student{
    NewStudent(String n, int a){
        super(n, a);
    }

    @Override
    void introduce(){
        System.out.println("Hello everyone!");
        super.introduce();
    }
}
public class Main{
    public static void main(String[] args) {

        Student s1 = new Student("Supriya", 20);
        s1.introduce();

        NewStudent s2 = new NewStudent("Suprabha", 25);
        s2.introduce();
    }
}
        /*Loop */
        // int sum = 0;
        // for(int i = 10; i >= 1; i--){
        //     sum += i;
        //     System.out.println(sum);
        // }

        /*taking input */
        // import java.util.Scanner;
        //public class Main{
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your marks: ");
        // int marks = scanner.nextInt();

        // if(marks > 75){
        //     System.out.println("Distinction");
        // } else if(marks > 60){
        //     System.out.println("First Class");
        // } else if(marks > 35){
        //     System.out.println("Passed");
        // } else {
        //     System.out.println("Failed");
        // }

        // scanner.close();

    /* Methods, ternary operator, print input value*/
    //static int add(int a, int b){
    //     return a + b;
    // }

    // static int square(int a){
    //     return a*a;
    // }

    // static boolean isEven(int x){
    //     return (x%2 == 0);
    // }

    // public static void main(String[] args){
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter x: ");
    //     int x = scanner.nextInt();

    //     int result = square(x);
    //     boolean is_even = isEven(x);
    //     System.out.println(result);
    //     System.out.println( is_even ? x + " is even" : x + " is odd") ;

    //     scanner.close();
    // }