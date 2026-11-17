class MainMethodP202
{
	public static void main(String[]args)
	{
	
		Demo d1=new Demo();
		int ans=d1.lastdigit(123);
		System.out.println(ans);	
				
	}
}

class Demo
{
	int lastdigit(int n)
	{
		return n%10;
	}
	
}