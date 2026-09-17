// Parent class
class Parent {
    int a = 10;
}

// Child class inherits Parent
class Child extends Parent {
    int a = 20;

    void show() {
        // Accesses Child class variable
        System.out.println("Child a: " + a);

        // Accesses Parent class variable using super
        System.out.println("Parent a: " + super.a);
    }
}

// Main class
public class super_keyword_variable {
    public static void main(String[] args) {

        // Creating Child class object
        Child sc = new Child();

        // Calling show() method
        sc.show();
    }
}