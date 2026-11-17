class Demo
{	
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
}

class MainMethod205_with_argument_no_return_type
{
	public static void main(String[]args)
	{	
		Demo d1=new Demo();
		d1.sum(40,20);
	}
}