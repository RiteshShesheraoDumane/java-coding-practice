//input 25
import java.util.Scanner;
class Demo
{
	boolean checkPerfectSquarNumber(int n)//23
	{
		return Math.sqrt(n)%1==0;//5%1==0
		
	}
	
}
class Mainclass226
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	
		Demo d1=new Demo();
		boolean ans=d1.checkPerfectSquarNumber(n);
		System.out.println("This number is perfect square:"+ans);
	}
}