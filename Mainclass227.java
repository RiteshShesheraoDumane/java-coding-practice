//input 125=5
import java.util.Scanner;
class Demo
{
	boolean checkPerfectCubeNumber(int n)//23
	{
		return Math.cbrt(n)%1==0;//5%1==0
		
	}
	
}
class MainClass227
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	
		Demo d1=new Demo();
		boolean ans=d1.checkPerfectCubeNumber(n);
		System.out.println("This is perfect cube:"+ans);
	}
}