
//File output Stream//
package NewPackage;

import java.io.FileOutputStream;
import java.io.IOException;

public class testfileoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fs = new FileOutputStream("E:\\NewFile.txt");
String text = "I Stay in Mumbai";
byte b[] = text.getBytes();
fs.write(b);
fs.close();


	}

}
