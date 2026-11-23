//input 154=(1!+5!+4!==154)
import java.util.Scanner;
class Demo
{
	boolean checkStrongNumber(int n)//145
	{
		int temp=n;
		int sum=0;//
		while(temp!=0)//
		{
			int fact=1;//
			int last=temp%10;//
			for(int i=1;i<=last;i++)
			{
				fact*=i;//
			}
			sum+=fact;//
			temp/=10;	
		}
		return sum==n;//
		
	}
	
}
class MainClass228
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	
		Demo d1=new Demo();
		boolean ans=d1.checkStrongNumber(n);
		System.out.println("This is Strong number:"+ans);
	}
}