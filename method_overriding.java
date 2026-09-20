class pita{
	void show() {
		System.out.println(" this is show method  of baap class");
	}
}
class children extends pita{
	@Override 
	void show() {
		System.out.println(" this is show method of children class");
		
	}
}
public class method_overriding {
	public static void main(String[] args) {
		children c =new children();
		c.show();
	}

}
