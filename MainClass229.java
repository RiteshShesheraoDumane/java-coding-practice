class Demo
{
	void m1()
	{
		System.out.println("m1 method called");
		m2();
	}
	void m2()
	{
		System.out.println("m2 method called");
		m3();
	}
	void m3()
	{
		System.out.println("m3 method called");
		m4();
	}
	void m4()
	{
		System.out.println("m4 method called");
		m5();
	}

	void m5()
	{
		System.out.println("m5 method called");
	}	
}
class MainClass229
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		d1.m1();
	}
}