//count the number of occurences of a perticular element x
import java.util.Scanner;
class Demo
{
	static int countOccurences(int []arr,int x)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}		
		}
		return count;
	}

}
class MainClass249
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		
		int []arr=new int[n];
		System.out.println("enter array's"+" "+ n +" "+"element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter x:");
		int x=sc.nextInt();
		
		System.out.println("count of x:"+ Demo.countOccurences(arr,x));	

			
	}
				
	
}