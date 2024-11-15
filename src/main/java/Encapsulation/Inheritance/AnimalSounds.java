package Encapsulation.Inheritance;

class Animal {
    public void makeSound() {
        System.out.println("Make some animal sound");
    }
}

class Dogdog extends Animal {
    @Override
    public  void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal myDog = new Dogdog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}