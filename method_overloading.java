//method overloading means same method name and different type of parameter 
class practice{
	
	void sum(int d, int n) {
	     int r=d+n;
	     System.out.println(" the sum is :"+r);	
	}
	
	void sum(int x,int y,int k) {
		int sum=x+y;
		System.out.println(" the sum of two nmber is:"+sum);
	}
	void sum(String s) {
		System.out.println(" the name is :"+s);
	}
	void sum(double d,int i) {
		System.out.println();
	}
}
public class method_overloading {
public static void main(String[] args) {
	practice sc =new practice();
	
	sc.sum(30,20);
	sc.sum(10,50,5);
	sc.sum("ritesh");
	sc.sum(59.7,5);
	
}
}
