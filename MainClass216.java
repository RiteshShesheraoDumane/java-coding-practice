import java.util.Scanner;
class Demo
{	
//wam to reverse a given number 
	int reverseNumber(int n)//12345
	{
		int sum=0;
		while(n!=0)
		{
			sum*=10;
			sum+=n%10;
			n/=10;
		}
		return sum;
		
	
	}
		
}
class MainClass216
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Demo d1=new Demo();
		int ans=d1.reverseNumber(n);
		System.out.println("the reverse number is:"+ans);	
	}
}