import java.util.Scanner;
class Demo
{	
	int reverseNumber(int n)//3452
	{
		int revno=0;
		while(n!=0)
		{
			int rem=n%10;
			revno=revno*10+rem;
			n/=10;
		}
		return revno;	
	}		
}
class MainClass221
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Demo d1=new Demo();
		int ans=d1.reverseNumber(n);
		System.out.println("The reverse number is:"+ans);	
	}
}