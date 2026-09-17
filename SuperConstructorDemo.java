// Super class
class SuperClass {
    SuperClass() {
        System.out.println("Super class constructor");
    }
}

// Sub class
class SubClass extends SuperClass {
    SubClass() {
        super(); // Calls SuperClass constructor
        System.out.println("Sub class constructor");
    }
}

// Main class
public class SuperConstructorDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
    }
}