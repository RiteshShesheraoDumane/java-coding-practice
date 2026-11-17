class MainMethodP201
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		Demo d2=new Demo();
		d1.a=100;
		int r=d2.a=50;
		System.out.println(d1.a);
		System.out.println(r);
	

		int k=Demo.b=10;
		System.out.println(k);
		
		d1.m1();
				
	}
}

class Demo
{
	int a; //instance variable
	static int b; //static variable
	
	void m1()
	{
		int p;//local variable of m1 method
		for(int i=5;i<=10;i++)
		{
			int b;//local variable of for loop 
			if(i==5)
			{
				int c=90; //local variable of if condition
				System.out.println(c);
			}
		}

	}
	
}