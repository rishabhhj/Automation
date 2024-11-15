package Encapsulation.Inheritance;

interface TheAnimal {
    void eat();
}

interface Pett {
    void play();
}

class Dog implements TheAnimal, Pett {
    public void eat() {
        System.out.println("Eating...");
    }

    public void play() {
        System.out.println("Playing...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}