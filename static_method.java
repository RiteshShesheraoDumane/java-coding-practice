import java.util.Scanner;

public class static_method {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
				
		int s=sum(a,b); // method calling
		System.out.println("the sum is :"+s);
	}
	 static int sum(int x,int y){ //  method defination  &&  this is static method &&  when we make static method that time we do not need to object creation 
		return x+y;
	}

}
