public class exception_handling {
public static void main(String[] args) {
	int a=10,b=0; int c;
	
	try {
		c=a/b;
		System.out.println(" the result is:"+c);
	}
	catch(Exception e) {
		System.out.println("Cannot divide by zero");
		
	}
	 System.out.println("Program continues...");	
}
}
