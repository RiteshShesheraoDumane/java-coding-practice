//WAM to return smallest and largest element 
import java.util.Scanner;
import java.util.Arrays;
class Demo
{
	static int[] smallestAndLargest(int []arr)
	{
		Arrays.sort(arr);
		int []ans={arr[0],arr[arr.length-1]};
		return ans;
	}
}
class MainClass254
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
			
			int []ans=Demo.smallestAndLargest(arr);
			System.out.println("smallest element:"+ans[0]);
			System.out.println("largest element:"+ans[1]);
			
	}
}