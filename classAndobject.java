
public class classAndobject {
	// person's properties 
		int age=22;
		int weight=58;
		String color="white";
		
		// perspn's behavior
		void eat() {
			System.out.println(" i am eating");
		}
		 void sleep(){
			 System.out.println("i am sleeping");
		 }
public static void main(String[] args) {	 
	classAndobject p =new classAndobject();
	System.out.println("printing person's properties");
	System.out.println(p.age);
	System.out.println(p.weight);
	System.out.println(p.color);
	
	System.out.println("printing person's behavior");
	p.eat();
	p.sleep();
	
	
}

}
