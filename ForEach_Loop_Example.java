
public class ForEach_Loop_Example {

    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, 21, 10, 7, 16};

        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Even numbers:");

        for (int num : numbers) {

            if (num % 2 == 0) {
                System.out.println(num);
                sumEven = sumEven + num;
            }
        }

        System.out.println("\nOdd numbers:");

        for (int num : numbers) {

            if (num % 2 != 0) {
                System.out.println(num);
                sumOdd = sumOdd + num;
            }
        }

        System.out.println("\nSum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}


