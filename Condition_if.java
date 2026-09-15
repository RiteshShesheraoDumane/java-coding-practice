import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class Condition_if {
	public static void main(String[] args) {
		int pwd;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter password:");
	    pwd=sc.nextInt();
		
		if(pwd==123) {
			System.out.println(" matched password");
		}
		else {
			System.out.println("wrong password");
		}
	}
}
