import java.util.Scanner;
class Demo
{
	double avgofDigit(int n)
	{
		int sum=0;
		int length=0;
		while(n!=0)
		{
			sum+=n%10;
			length++;
			n/=10;	
		}
		return (double) sum/length;
	}
}
class MainMethod214
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Demo d1=new Demo();
		double ans=d1.avgofDigit(n);
		System.out.println(ans);
		
	}
}