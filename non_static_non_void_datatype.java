
import java.util.Scanner;

public class non_static_non_void_datatype {

    public static void main(String[] args) {

    	non_static_non_void_datatype rf = new non_static_non_void_datatype();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

       int result= rf.sum(a,b);
       System.out.println(" the sum is :"+result);
    }

    int sum(int x, int y) {

        return x+y;
    }
}

