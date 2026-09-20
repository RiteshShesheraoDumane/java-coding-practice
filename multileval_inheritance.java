class baap{
	int a,b,c;
	void addition() {
		a=10;b=20;
		c=a+b;
		System.out.println(" the addition is:"+c);
	}
	void substraction() {
		a=40;b=20;
		c=a-b;
		System.out.println(" the substraction is:"+c);
	}
}
class child1 extends baap{
	void multiplication() {
		a=4;b=5;
		c=a*b;
		System.out.println(" the multiplication is:"+c);
	}
	void division() {
		a=20;b=10;
		c=a/b;
		System.out.println(" the division is:"+c);
	}
}
class child2 extends child1{
	void reminder() {
		a=20;b=5;
		c=a%b;
		System.out.println(" the reminder is:"+c);
	}
	
}
public class multileval_inheritance {
public static void main(String[] args) {
	child2 sc =new child2();
	sc.addition();
	sc.substraction();
	sc.multiplication();
	sc.division();
	sc.reminder();
	
	
}
}
