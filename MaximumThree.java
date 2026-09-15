import java.util.Scanner;

public class MaximumThree {
public static void main(String[] args) {
	int a,b,c,max;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter first number");
	 a=sc.nextInt();
	 System.out.println("enter secod number");
	 b=sc.nextInt();
	 System.out.println("enter third number");
	 c=sc.nextInt();
	 if(a>=b&&a>=c) {
	 max=a;	
   }
	 else if(b>=a&&b>=c) {
		max= b;
	 }
	 else {
		 max=c;
	 }
	 System.out.println("maximum number is:"+max);
}
}
