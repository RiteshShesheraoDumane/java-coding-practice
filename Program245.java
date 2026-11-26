import java.util.Scanner;
class Program245
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of person");
		String name=sc.next();
		switch(name)
		{
			case "ritesh":
				System.out.println("my name is ritesh");
			break;
			case "saurabh":
				System.out.println("my name is saurab");
			break;
			case "nikhil":
				System.out.println("my name is nikhil");
			break;
			case "prasad":
				System.out.println("my name is prasad");
			break;
			case "sonya":
				System.out.println("my name is sonya");
			break;
			case "abhi":
				System.out.println("my name is abhi");
			break;
			default:
				System.out.println("invalid choice");
		}	                                                                                                                                                                          
	}
}