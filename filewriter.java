import java.io.FileWriter;
import java.io.IOException;
public class filewriter {
public static void main(String[] args) {
	try {
		FileWriter f=new FileWriter("D:\\Desktop\\JavaCodePractice\\RD.txt");
		try {
			f.write(" java programming is the best language ");
			
		}
		finally {
			f.close();
		}
		System.out.println(" successfully wrote in the file ");
		
	}
	catch(IOException i) {
		System.out.println(i);
	}
	System.out.println( "  file not wrote in the older ");
}
}
