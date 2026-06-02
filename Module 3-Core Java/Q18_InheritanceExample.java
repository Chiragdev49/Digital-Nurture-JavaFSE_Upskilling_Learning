class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Q18_InheritanceExample {
    public static void main(String[] args) {

        // Creating Animal object
        Animal animal = new Animal();
        animal.makeSound();

        // Creating Dog object
        Dog dog = new Dog();
        dog.makeSound();
    }
}