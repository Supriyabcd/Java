class Animal{
    void eat(){
        System.out.println("Ate food");
    }

    void sound(){
        System.out.println("Makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meows");
    }
}

class PolymorphismBird extends Animal{
    @Override
    void sound(){
        System.out.println("Sings");
    }
}
public class PolymorphismDemo {
    public static void run() {
        Dog d = new Dog();
        Cat c = new Cat();
        PolymorphismBird b = new PolymorphismBird();

        d.sound();
        c.sound();
        b.sound();
    }
}
