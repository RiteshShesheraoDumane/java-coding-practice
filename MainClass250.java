//count the number of occurences of a perticular element x
import java.util.Scanner;
class Demo
{
	static int countOccurences(int []arr,int x)
	{
		int lastindex=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				lastindex=i;
			}		
		}
		return lastindex;
	}

}
class MainClass250
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
	
		System.out.println("last occurence of an element x:"+ Demo.countOccurences(arr,x));	
			
	}
				
	
}