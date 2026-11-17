class Demo
{
	int secondDigit(int n)
	{
		while(n>99)
		{
			n/=10;		
		}
		return n%10;
		
	}
}

class MainMethod210
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		int ans=d1.secondDigit(5396);
		System.out.println(ans);
	}
}