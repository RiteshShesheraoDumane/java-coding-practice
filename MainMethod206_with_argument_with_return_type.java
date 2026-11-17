class Demo
{
	int sum(int a,int b)
	{
		return a+b;
	}
}

class MainMethod206_with_argument_with_return_type
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		int ans=d1.sum(35,50);
		System.out.println(ans);
	}
}