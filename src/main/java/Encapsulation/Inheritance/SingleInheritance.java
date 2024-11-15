package Encapsulation.Inheritance;

class Pet {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dogg extends Pet {
    void bark() {
        System.out.println("Barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dogg dog = new Dogg();
        dog.eat();
        dog.bark();
    }
}
