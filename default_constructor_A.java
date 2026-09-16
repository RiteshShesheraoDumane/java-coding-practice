
public class default_constructor_A {
int a;String name ;boolean c;

    default_constructor_A(){
	  a=1134;name="ritesh";c=true;
     }
    
	void show() {
		System.out.println("learn coding:"+a+" "+name+" "+c);
	}
	
}
class B{
	public static void main(String[] args) {
		default_constructor_A sc =new default_constructor_A();
		sc.show();
	}
}
