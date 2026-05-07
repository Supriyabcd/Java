class Student{
    static String school = "ABC Vidyalaya";
    String name;

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name + " studies at " + school);
    }

}
public class StaticVsInstance{
    public static void main(String[] args) {
        Student s1 = new Student("Supriya");
        Student s2 = new Student("Mona Lisa");

        s1.display();
        s2.display();
    }
}