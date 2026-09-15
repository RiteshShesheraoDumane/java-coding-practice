import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		int c;
		System.out.println("enter your choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:c=a+b;
		System.out.println("addition is :"+c);
		break;
		
		case 2:c=a-b;
		System.out.println("substraction is :"+c);
		break;
		
		case 3:c=a*b;
		System.out.println("multiplication is :"+c);
		break;
		
		case 4:c=a/b;
		System.out.println("division is:"+c);
		break;
		
		case 5 : c=a%b;
		System.out.println("reminder is:"+c);
		break;
		
		default:
			System.out.println("invalid choice");
		}
	}

}
