package NewPackage;

import java.io.FileInputStream;
import java.io.IOException;

public class TestinputFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fs = new FileInputStream("E:\\\\NewFile.txt");
int i = 0;
while ((i = fs.read()) !=-1)
{
	System.out.print((char)i);
	
}
fs.close();
	}

}
