class Demo
{	
	int a,b;
	void sum()
	{
		System.out.println(a+b);
	} 
}

class MainMethod204_no_argument_no_return_type
{
	public static void main(String[]args)
	{	
		Demo d1=new Demo();
		d1.a=10;
		d1.b=20;
		d1.sum();
	}
}