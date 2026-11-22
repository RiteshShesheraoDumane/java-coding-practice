
import java.util.Scanner;

class Demo
{
    void checkprime(int n)
    {
        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not prime number");
        }
    }
}

class MainClass223
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        Demo d1 = new Demo();
        d1.checkprime(n);
    }
}
