
import java.util.Scanner;

public class IncrementDecrement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Original number: " + num);

        // Post-increment
        System.out.println("Post-increment: " + num++);
        System.out.println("After post-increment: " + num);

        // Pre-increment
        System.out.println("Pre-increment: " + (++num));

        // Post-decrement
        System.out.println("Post-decrement: " + num--);
        System.out.println("After post-decrement: " + num);

        // Pre-decrement
        System.out.println("Pre-decrement: " + (--num));
    }
}

