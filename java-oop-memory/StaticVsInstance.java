class SchoolStudent{
    static String school = "ABC Vidyalaya";
    String name;

    SchoolStudent(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name + " studies at " + school);
    }

}
public class StaticVsInstance{
    public static void run() {
        SchoolStudent s1 = new SchoolStudent("Supriya");
        SchoolStudent s2 = new SchoolStudent("Mona Lisa");

        s1.display();
        s2.display();
    }
}