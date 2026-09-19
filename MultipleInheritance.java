class Parent {

    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("The addition is: " + c);
    }

    void sub() {
        a = 40;
        b = 30;
        c = a - b;
        System.out.println("The subtraction is: " + c);
    }
}

class Child1 extends Parent {

    void multi() {
        a = 40;
        b = 90;
        c = a * b;
        System.out.println("The multiplication is: " + c);
    }

    void div() {
        a = 10;
        b = 5;
        c = a / b;
        System.out.println("The division is: " + c);
    }
}

class Child2 extends Child1 {

    void rem() {
        a = 20;
        b = 2;
        c = a % b;
        System.out.println("The remainder is: " + c);
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Child2 obj = new Child2();

        obj.add();
        obj.sub();
        obj.multi();
        obj.div();
        obj.rem();
    }
}