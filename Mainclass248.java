class Demo
{
	void demoarray()
	{
		int [] ages=new int[4];
		ages[0]=20;
		ages[1]=23;
		ages[2]=59;
		ages[3]=60;
		
		System.out.println("print by using for loop");
		for(int i=0;i<=3;i++)
		{
			System.out.println(ages[i]);
		}
		System.out.println("print by using for each loop");
		for(int ans:ages)
		{
			System.out.println(ans);
		}
		System.out.println("print by using while loop");
		int j=0;
		while(j<ages.length)
		{
			System.out.println(ages[j]);
			j++;
		}
		System.out.println("print by using do while loop");
		int k=0;//1
		do
		{
			System.out.println(ages[k]);
			k++;
		}while(k<ages.length);
		System.out.println("  ");


		String [] name={"ritesh","shesherao","mirabai","ashiya","ashwini","chautrabai","maloji"};
		System.out.println(name.length);
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
			
	}
	void multiarray()
	{
		// int [][] marks=new int[5][3];
		int [][] marks={{56,43,6},{34,7,8},{12,56,8}};
		System.out.println(marks[0][0]);//56
		System.out.println(marks[0][1]);//43
		System.out.println(marks[0][2]);//6
		
		System.out.println(marks[1][0]);//34
		System.out.println(marks[1][1]);//7
		System.out.println(marks[1][2]);//8
	
		System.out.println(marks[2][0]);//12
		System.out.println(marks[2][1]);//56
		System.out.println(marks[2][2]);//8
	}

}
class MainClass248
{
	public static void main(String[]args)
	{
		Demo d1=new Demo();
			d1.demoarray();
			
			
			
	}
				
	
}