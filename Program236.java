//profit loss question  
//profit=selling prize-cost prize 
//loss=cost prize-selling prize

import java.util.Scanner;
class Program236
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your selling:");
		int sp=sc.nextInt();
		System.out.println("enter your cost prise:");
		int cp=sc.nextInt();
		
		if(sp>cp)
		{
			int profit=sp=cp;
			System.out.println("your profit is:"+profit);
		}
		else
		{
			int loss=cp-sp;
			System.out.println("your loss is:"+loss);
			
		}
			

	}
}