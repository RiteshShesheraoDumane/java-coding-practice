class Demo
{
	void m1()
	{
		m2();
		System.out.println("m1 method called");
	}
	void m2()
	{
		m3();
		System.out.println("m2 method called");
	}
	void m3()
	{
		m4();
		System.out.println("m3 method called");
	}
	void m4()
	{
		m5();
		System.out.println("m4 method called");
	}
	void m5()
	{
		
		System.out.println("m5 method called");
	}

}
class MainClass230
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		d1.m1();
	}
}