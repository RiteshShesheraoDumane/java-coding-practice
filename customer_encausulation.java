import java.util.Scanner;

class Bank {
	
	private double balance=5000;
	 private int  pwd;
	
	 public void deposit(double money ) {
		 System.out.println("enter password");
		 Scanner sc=new Scanner(System.in);
		 pwd=sc.nextInt();
		 if(pwd==123) {
		balance=balance+money;
		System.out.println("Deposited money"+money);
		System.out.println("Total Balance:"+balance);
			 
		 }
		 else{
			System.out.println("you have enter wrong password "); 
		 }
		 
	 }
	 
	 public void withdraw(double money) {
		 System.out.println("enter password");
		 Scanner sc=new Scanner(System.in);
		 pwd=sc.nextInt();
		 if(pwd==123) {
		balance=balance-money;
		System.out.println("Withdraw money:"+money);
		System.out.println("Total Balance:"+balance);
			 
		 }
		 else{
			 System.out.println("you have enter wrong password");
		 }
		 
	 }
	 public void checkbalance() {
		 System.out.println("enter password");
		 Scanner sc=new Scanner(System.in);
		 pwd=sc.nextInt();
		 if(pwd==123) {	 
		 }
		 else{
			 System.out.println("you have enter wrong passwrod ");
		 }
		 
	 }
	  
	 
}
public class customer_encausulation {
	public static void main(String[] args) {
		Bank b =new Bank();
		System.out.println("1.deposite");
		System.out.println("2.withdraw");
		System.out.println("3.checkbalance");
		
		System.out.println("enter your choice:");
		Scanner sc2=new Scanner(System.in);
		int ch=sc2.nextInt();
		
		
		switch(ch){
		case 1: b.deposit(3000);
			break;
		
		case 2:b.withdraw(2000);
			break;
			
		case 3:b.checkbalance();
			break;
			
		default: System.out.println("invalid choice");
		}
		
	}

}