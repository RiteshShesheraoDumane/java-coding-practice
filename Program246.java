import java.util.Scanner;
class Program246
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day");
		char day =sc.next().charAt(0);
		switch(day)
		{
			case 'a':
				System.out.println("my name is ritesh");
			break;
			case 'k':
				System.out.println("my name is saurab");
			break;
			case 'l':
				System.out.println("my name is nikhil");
			break;
			case 'd':
				System.out.println("my name is prasad");
			break;
			case 'r':
				System.out.println("my name is sonya");
			break;
			case 'g':
				System.out.println("my name is abhi");
			break;
			default:
				System.out.println("invalid choice");
		}	                                                                                                                                                                          
	}
}