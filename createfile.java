import java.io.File;
import java.io.IOException;
public class createfile {
public static void main(String[] args) throws IOException {
	File f= new File( "D:\\Desktop\\JavaCodePractice\\RD.txt");
	if(f.createNewFile()) {
		System.out.println(" successfully file created in the current path ");
	}
	else {
		System.out.println(" file already exists in the folder");
	}
}
}
