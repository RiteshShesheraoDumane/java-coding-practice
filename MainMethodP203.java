import java.util.Scanner;
class MainMethodP203
{
	public static void main(String[]args)
	{	Demo d1=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		int ans=d1.secondLastDigit(n);
		System.out.println(ans);
		
	}
}

class Demo
{
	int secondLastDigit(int n)
	{
		return (n/10)%10;
	}
	
}