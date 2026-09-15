
import java.util.Scanner;

public class non_static_method {

    public static void main(String[] args) {

        non_static_method rf = new non_static_method();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        rf.sum(a, b);
    }

    void sum(int x, int y) {

        System.out.println("The sum of two numbers is: " + (x + y));
    }
}

