class Employee{
    String name;

    Employee(String name){
        this.name = name;
        System.out.println(name + " -> Object created");
    }

    void destroy(){
        System.out.println(name + " -> Object destroyed");
    }
}

public class LifecycleDemo{
    public static void run() {
        Employee e1 = new Employee("Supriya");
        e1.destroy();
        System.out.println("End of program");
    }
}
// class Employee implements AutoCloseable {

//     String name;

//     Employee(String name) {
//         this.name = name;
//         System.out.println(name + " object created");
//     }

//     @Override
//     public void close() {
//         System.out.println(name + " object closed");
//     }
// }

// public class LifecycleDemo {

//     public static void main(String[] args) {

//         try (Employee e1 = new Employee("ABC")) {

//             System.out.println("Working...");

//         }
//     }
// }