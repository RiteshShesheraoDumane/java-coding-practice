class student {

    int age;
    String name;

    void setdata(int a, String name) {
        this.age = a;
        this.name = name;
    }

    void display() {
        System.out.println("coding: " + this.age);
        System.out.println("coding: " + this.name);
    }
}

public class ThisKeywordMethod {

    public static void main(String[] args) {
        student s = new student();

        s.setdata(23, "ritesh");
        s.display();
    }
}