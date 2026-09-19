// Abstract class
// It contains common methods and abstract methods
abstract class Animal {

    // Common method
    // Both Dog and Cow can use this method
    void legs() {
        System.out.println("All animals have 4 legs");
    }

    // Abstract method
    // Child classes must provide their own implementation
    abstract void sound();

    // Abstract method
    // Child classes must provide their own implementation
    abstract void eat();
}

// Dog class inherits Animal
class Dog extends Animal {

    // Providing implementation of abstract sound() method
    @Override
    void sound() {
        System.out.println("Bow bow barking");
    }

    // Providing implementation of abstract eat() method
    @Override
    void eat() {
        System.out.println("Meat eating");
    }
}

// Cow class inherits Animal
class Cow extends Animal {

    // Providing implementation of abstract sound() method
    @Override
    void sound() {
        System.out.println("Moo moo moo");
    }

    // Providing implementation of abstract eat() method
    @Override
    void eat() {
        System.out.println("Grass eating");
    }
}


public class Abstract {

    public static void main(String[] args) {

       
        Dog d = new Dog();   // Creating Dog object

        Cow c = new Cow();           // Creating Cow object

        // Calling Dog methods
        System.out.println("This is about Dog");
        d.sound();
        d.eat();
        d.legs();

        System.out.println();

        // Calling Cow methods
        System.out.println("This is about Cow");
        c.sound();
        c.eat();
        c.legs();
    }
}