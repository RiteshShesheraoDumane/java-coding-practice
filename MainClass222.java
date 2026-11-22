import java.util.Scanner;
class Demo
{	
	boolean checkpalindrome(int n)//3485
	{
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			sum=sum*10+temp%10;
			temp/=10;
		}
		return sum==n;
		
			
	}		
}
class MainClass222
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Demo d1=new Demo();
		boolean ans =d1.checkpalindrome(n);
		System.out.println("This number is palindrome number:"+ans);
		
	}
}