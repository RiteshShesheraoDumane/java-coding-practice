import java.util.Scanner;
class Demo
{	
//wam to append sum of digit at first 
	int sumofDigitAtFirst(int n)//12345
	{
		int sum=0,length=1,temp=n;
		while(temp!=0)
		{
			sum+=temp%10;//15
			length*=10;//length=100000
			temp/=10;//0
		}
		sum*=length;//1500000
		n+=sum;
		return n;
	
	}
		
}
class MainClass217
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Demo d1=new Demo();
		int ans=d1.sumofDigitAtFirst(n);
		System.out.println("the append sum of digit at first:"+ans);	
	}
}