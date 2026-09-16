public class parameterized_constructor_A {

    int x;
    int y;

    parameterized_constructor_A(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println("learn coding: " + x + " " + y);
    }
}

class B {
    public static void main(String[] args) {

        parameterized_constructor_A sc =
                new parameterized_constructor_A(100, 200);

        sc.show();
    }
}