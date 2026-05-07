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

class Bird extends Animal{
    @Override
    void sound(){
        System.out.println("Sings");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();

        d.sound();
        c.sound();
        b.sound();
    }
}
