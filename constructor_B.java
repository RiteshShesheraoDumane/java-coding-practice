class A{
	
	int a; String name;
	A(){          // constructor
		a=0;name=null;
	}
	
	void show() {
		System.out.println("learn coding: "+a+" "+name);
	}
}





public class constructor_B {
	public static void main(String[] args) {
		A sc=new A();
		sc.show();
	}

}
