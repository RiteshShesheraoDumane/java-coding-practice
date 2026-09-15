
import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("First number > Second number: " + (num1 > num2));

        System.out.println("First number < Second number: " + (num1 < num2));

        System.out.println("Both numbers are equal: " + (num1 == num2));

        System.out.println("First number >= Second number: " + (num1 >= num2));

        System.out.println("First number <= Second number: " + (num1 <= num2));

        System.out.println("Both numbers are not equal: " + (num1 != num2));
    }
}

