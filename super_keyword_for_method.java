// Parent class
class parent {

    // Method of parent class
    void show() {
        System.out.println("This is parent method");
    }
}

// Child class inherits parent class
class child extends parent {

    // Child class overrides the parent show() method
    void show() {

        // Calls the show() method of parent class
        super.show();

        // Prints the child class method message
        System.out.println("This is child method");
    }
}

// Main class
public class super_keyword_for_method {

    public static void main(String[] args) {

        // Creating object of child class
        child cd = new child();

        // Calling the child class show() method
        cd.show();
    }
}