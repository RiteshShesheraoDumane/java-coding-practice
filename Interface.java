import java.awt.Color;
import java.util.jar.Attributes.Name;

interface  vehicle{
	String name ="TVS";
	int speed =100;
	
    void start();
	void stop();
	
	default void Color() {
		System.out.println("the color of vehicle is red ");
	}
	static void name() {
		System.out.println(" the name of vehicle is TVS ");
	}
	
	public class Customer implements vehicle{
		@Override
		public void start() {
			System.out.println("when  we click on the start button that time vehicle start ");
		}
		@Override
		public void stop(){
			System.out.println("when we click on the stop button that time vehicle stop");
		}
	
	}
	public class Interface {
		public static void main(String[] args) {
			Customer c =new Customer();
			
			c.start();
			c.stop();
			
			c.Color();
			
			name();
		}
	}
}


