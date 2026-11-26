//area of rectangle formulla is A=l*b
// perimeter of rectangle is P=2*(l+b)

import java.util.Scanner;
class Program237
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of rectangle:");
		int l=sc.nextInt();
		System.out.println("enter breath of rectangle :");
		int b=sc.nextInt();

		int area=l*b;
		System.out.println("the area of rectangle is :"+area);

		int perimeter=2*(l+b);
		System.out.println("the perimeter of rectangle is :"+ perimeter);
		
		if(area>perimeter)
		{
			System.out.println("the area of rectangle is greater ");
		}
		else
		{
			System.out.println("the perimeter of rectangle is greter");
		}
			

	}
}