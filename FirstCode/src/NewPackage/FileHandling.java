
//File Handling create file//
package NewPackage;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File f = new File ("E:\\NewFile.txt");
		Boolean Status = f.createNewFile();
		if (Status) {
			System.out.println("File is Created");
			
		}
		else {
			System.out.println("File not created");
		}

	}

}
