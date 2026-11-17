import java.util.Scanner;
class Demo
{	
	int sumofDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}
class MainMethod212
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
	
		Demo d1=new Demo();
		int ans=d1.sumofDigit(n);
		System.out.println(ans);
	}
}