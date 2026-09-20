interface daddy1 {
    void show1();
}

interface daddy2 {
    void show2();
}

class betaa implements daddy1, daddy2 {

    public void show1() {
        System.out.println("This is daddy1 method");
    }

    public void show2() {
        System.out.println("This is daddy2 method");
    }
}

public class multiple_inheritance {

    public static void main(String[] args) {

        betaa c = new betaa();

        c.show1();
        c.show2();
    }
}