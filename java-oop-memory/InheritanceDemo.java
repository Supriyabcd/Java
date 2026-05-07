class InheritanceAnimal{
    void eat(){
        System.out.println("Ate food");
    }

    void sound(){
        System.out.println("Makes sound");
    }
}

class InheritanceDog extends InheritanceAnimal{
    void bark(){
        System.out.println("Barks");
    }
}
public class InheritanceDemo{
    public static void run() {
        InheritanceDog d1 = new InheritanceDog();

        d1.eat();
        d1.sound();
        d1.bark();
    }
}