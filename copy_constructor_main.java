class Student {
    int a;
    String s;

    Student() {
        a = 10;
        s = "ritesh";
    }

    // Copy constructor
    Student(Student ref) {
        a = ref.a;
        s = ref.s;

        System.out.println("learn coding: " + a + " " + s);
    }
}

public class copy_constructor_main {
    public static void main(String[] args) {
        Student r = new Student();
        Student r2 = new Student(r);
    }
}