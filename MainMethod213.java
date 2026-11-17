import java.util.Scanner;
class Demo
{	
	int firstAndlastDigit(int n)
	{
		int sum=0;
		if(n>99)
		{
			int last=n%10;
			while(n>9)
			{
				n/=10;
			}
			n = n * 10 + last;
			
		}
		return n;
		
	}
}
class MainMethod213
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
	
		Demo d1=new Demo();
		int ans=d1.firstAndlastDigit(n);
		System.out.println(ans);
	}
}