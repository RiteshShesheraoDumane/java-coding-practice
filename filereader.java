import java.io.FileReader;
import java.io.IOException;

public class filereader {
public static void main(String[] args) {
	
	try {
		FileReader f = new FileReader("D:\\Desktop\\JavaCodeProgram\\RD.txt");
		try {
			int i;
			while((i=f.read())!= -1) {
				System.out.println((char)i);
			}
		}
		finally {
			f.close();
		}
	}
	catch(IOException e) {
		System.out.println("exception handled..");
	}
}
}
