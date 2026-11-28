//count the number of triplets whose sum is equal to the given value x
import java.util.Scanner;
class Demo
{
	static int pairsum(int []arr,int target)
	{
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++)//finding first numner
		{
			for(int j=i+1;j<n;j++)//finding second number
			{
				for(int k=j+1;k<n;k++)//finding third number
				{
					if(arr[i]+arr[j]+arr[k]==target)
					{
						ans++;
					}
				}
			}
		}
		return ans;	
	}
}
class MainClass256
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();	

		int [] arr=new int[n];
		System.out.println("enter array element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter target sum:");
		int x=sc.nextInt();
		
		System.out.println("Number of pairs:"+ Demo.pairsum(arr,x));
		
		
	}
}