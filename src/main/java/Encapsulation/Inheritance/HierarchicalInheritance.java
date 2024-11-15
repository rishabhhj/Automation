package Encapsulation.Inheritance;

class animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Doggg extends animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cattt extends animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Doggg dog = new Doggg();
        Cattt cat = new Cattt();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}