//count the number of elements strictly greater than value x
import java.util.Scanner;
class Demo
{
	static int countGreater(int []arr,int x)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>x)
			{
				count++;
			}
			
		}
		return count;
	}
}
class MainClass251
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of array:");
		int n=sc.nextInt();
		
		int []arr=new int[n];
		System.out.println("enter the array element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element x:");
		int x=sc.nextInt();
		
		int ans=Demo.countGreater(arr,x);
		System.out.println("count number  of elements strictly greater than value x:"+ans);
		
	}
}