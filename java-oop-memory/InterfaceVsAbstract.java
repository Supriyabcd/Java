

interface Flyable{
    void fly();
}

abstract class Bird{
    abstract void makeSound();

    void sleep(){
        System.out.println("Bird sleeps");
    }
}

class Sparrow extends Bird implements Flyable{
    @Override
    void makeSound(){
        System.out.println("Chirp chirp");
    }

    @Override 
    public void fly(){
        System.out.println("Sparrow flies low in the sky");
    }
}
public class InterfaceVsAbstract{
    public static void main(String[] args) {
        Sparrow s = new Sparrow();

        s.makeSound();
        s.fly();
        s.sleep();
    }
}