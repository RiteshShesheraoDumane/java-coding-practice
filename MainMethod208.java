class Demo
{
	int secondlastDigit(int n)
	{
		int k=(n/10)%10;
		return k;
	}
}

class MainMethod208
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		int ans=d1.secondlastDigit(4567);
		System.out.println(ans);
	}
}