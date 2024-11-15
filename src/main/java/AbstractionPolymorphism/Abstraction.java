package AbstractionPolymorphism;

abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();

        myDog.makeSound();
        myDog.sleep();
    }
}