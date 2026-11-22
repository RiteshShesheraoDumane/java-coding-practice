//6= 12345
//6 =1+2+3=6
import java.util.Scanner;
class Demo
{
    boolean checkperfectnumber(int n)
    {	
	int sum=0;
      	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum+=i;
		}
	}
	return n==sum;
    }
}

class MainClass224
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        Demo d1 = new Demo();
	boolean ans =d1.checkperfectnumber(n);
	System.out.println("this is perfect number:"+ans);
       
    }
}
