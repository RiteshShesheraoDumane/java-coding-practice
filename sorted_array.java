import java.util.Arrays;
import java.util.Scanner;

public class sorted_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter array elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array:");

        Arrays.sort(arr);

        for (int a : arr) {
            System.out.println(a);
        }

        sc.close();
    }
}