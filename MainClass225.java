//153=(1*1*1 + 5*5*5 + 3*3*3 = 153)
import java.util.Scanner;
class Demo
{
    boolean checkArmStrongnumber(int n)
    {	int arm=0,rem;
	int c=n;
	while(n!=0)
	{
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n/=10;
	}
	return c==arm;
    }
}

class MainClass225
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        Demo d1 = new Demo();
	boolean ans =d1.checkArmStrongnumber(n);
	System.out.println("this is perfect number:"+ans);
       
    }
}
