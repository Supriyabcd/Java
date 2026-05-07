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
public class MemoryDemo{
    public static void main(String[] args) {

        Student s1 = new Student("Supriya", 20);
        s1.introduce();
        //stack: reference s1
        //heap: Student object 

        NewStudent s2 = new NewStudent("Suprabha", 25);
        s2.introduce();
        //stack: reference s2
        //heap: NewStudent object
    }
}