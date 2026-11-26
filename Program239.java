
import java.util.Scanner;

class Program239
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number :");
        int n= sc.nextInt();
	if(n>=100 && n<1000)//n>99 && n<=999
	{
		System.out.println("the number is three digit number ");
	}
	else
	{
		System.out.println("the number is not three digit number ");   
	}
	
    }
}
