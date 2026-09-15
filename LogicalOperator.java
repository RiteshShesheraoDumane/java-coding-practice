
import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        // AND operator &&
        if (age >= 18 && marks >= 50) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // OR operator ||
        if (age < 18 || marks < 50) {
            System.out.println("Condition failed");
        } else {
            System.out.println("Condition passed");
        }

        // NOT operator !
        boolean eligible = (age >= 18 && marks >= 50);

        System.out.println("Eligible: " + eligible);
        System.out.println("Not Eligible: " + !eligible);
    }
}

