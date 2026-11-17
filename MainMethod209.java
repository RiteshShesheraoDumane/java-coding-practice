class Demo
{
	int firstDigitofNumber(int n)
	{
		while(n>9)
		{
			n/=10;	
		}
		return n;	
	}
}

class MainMethod209
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		int ans=d1.firstDigitofNumber(8909);
		System.out.println(ans);
	}
}