class Animal{
    void eat(){
        System.out.println("Ate food");
    }

    void sound(){
        System.out.println("Makes sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barks");
    }
}
public class InheritanceDemo{
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.eat();
        d1.sound();
        d1.bark();
    }
}