// Parent class
class Employee{

    int rollno, marks;
    String name;

    void input() {
        System.out.println("This is student class");
    }
}

// Child class
class Ritesh extends Employee {

    void display() {
        rollno = 210;
        marks = 87;
        name = "Ritesh";

        System.out.println("This is about Ritesh: " + rollno + " " + marks + " " + name);
    }
}

// Main class
public class SingleInheritance {

    public static void main(String[] args) {

        Ritesh r = new Ritesh();
        r.display();
    }
}