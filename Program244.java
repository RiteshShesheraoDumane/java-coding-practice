import java.util.Scanner;
class Program244
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("sunday");
			break;
			case 2:
				System.out.println("monday ");
			break;
			case 3:
				System.out.println("tuesday");
			break;
			case 4:
				System.out.println("wednesday");
			break;
			case 5:
				System.out.println("thursday");
			break;
			case 6:
				System.out.println("saturday");
			break;
			default:
				System.out.println("invalid choice");
		}	                                                                                                                                                                          
	}
}