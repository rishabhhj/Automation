package Encapsulation.Inheritance;

class Animall {
    void eat() {
        System.out.println("Eating...");
    }
}

class Doggy extends Animall {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Doggy {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
    }
}