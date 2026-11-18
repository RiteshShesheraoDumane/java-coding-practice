import java.util.Scanner;
class Demo
{	
//wam return max digit form given number
	int max=0;
	int maxDigit(int n)//1234
	{
		while(n!=0)
		{
			int last=n%10;
			if(last>max)
				max=last;
			n/=10;
		}
		return max;
	}
	
		
}
class MainClass218
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Demo d1=new Demo();
		int ans=d1.maxDigit(n);
		System.out.println("the maximum number is:"+ans);	
	}
}