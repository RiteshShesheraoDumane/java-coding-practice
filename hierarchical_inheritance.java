class dady{
	void show() {
		System.out.println(" this is show method of the dady class");
	}
}
class beta1 extends dady{
	void disp() {
		System.out.println("this is disp method of beta1 class");
	}
}
class beta2 extends dady{
	void mood() {
		System.out.println(" this is mood method of beta2 class");
	}
}
public class hierarchical_inheritance {
public static void main(String[] args) {
	beta1 c1 =new beta1();
	beta2 c2 =new beta2();
	
	c1.show();
	c1.disp();
	System.out.println(" ");
	c2.show();
	c2.mood();
	
	
	
}
}

