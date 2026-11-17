class Demo
{
	int a,b;
	int sum()
	{
		return a+b;
	}
}

class MainMethod206_no_argument_with_return_type
{
	public static void main(String[]args)
	{
		Demo d1 = new Demo();
		d1.a=10;
		d1.b=90;
		int ans = d1.sum();
		System.out.println(ans);
	}
}