// gretest find number between three 
import java.util.Scanner;

class Program241
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first  number :");//6
        int a= sc.nextInt();
	 System.out.println("enter secind number :");//893
        int b= sc.nextInt();
	 System.out.println("enter third number :");//76
        int c= sc.nextInt();
	if(a>b &&a>c)//6>893 && 6>76
	{
		System.out.println("the a is largest ");
	}
	else if(b>a && b>c)//893>6 && 893>76
	{
		System.out.println("the b is largest ");
	}
	else
	{
		System.out.println("the c is largest ");
	}
	
	
    }
}
