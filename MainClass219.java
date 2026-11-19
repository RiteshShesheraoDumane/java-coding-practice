import java.util.Scanner;
class Demo
{	
	int shiftlastDigittoFirst(int n)//123456
	{
		int last=n%10;//600000
		n/=10;//12345
		int temp=n;
		while(temp!=0)//12345!=0
		{
			last*=10;
			temp/=10;
		}
		n+=last;//600000+12345=612345
		return n;
	}		
}
class MainClass219
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Demo d1=new Demo();
		int ans=d1.shiftlastDigittoFirst(n);
		System.out.println("The shift last digit to first:"+ans);	
	}
}