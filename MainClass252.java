//check if the given array is sorted or not 
import java.util.Scanner;
class Demo
{
	static boolean isSorted(int []arr)
	{
		boolean check=true;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				//not storted
				check=false;
				break;
			}
		}
		return check;
	}
}
class MainClass252
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
		
		
		boolean ans=Demo.isSorted(arr);
		System.out.println("the given array is sorted :"+ans);
		
	}
}