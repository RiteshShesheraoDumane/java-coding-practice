import java.util.Scanner;

public class else_if {
public static void main(String[] args) {
	int marks;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter marks of student");
	marks=sc.nextInt();
	
	if(marks>=60 && marks<=100) {
		System.out.println("student is first division");
	}
	else if(marks>=45&& marks<60){
		System.out.println("student is second division");
	}
	else if(marks>=35&& marks<45){
		System.out.println("student is third  division");
	}
	else {
		System.out.println("student fail");
	}
	
	
}
}
