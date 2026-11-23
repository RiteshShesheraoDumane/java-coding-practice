//input copy 153=(1*1*1 + 5*5*5 + 3*3*3 = 153)
import java.util.Scanner;
class Demo
{
	boolean checkPerfectSquarNumber(int n)
	{
		return Math.sqrt(n)%1==0;
		
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