package NewPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingFramework1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("E:\\Testcase.xls");
		HSSFWorkbook hw = new HSSFWorkbook(fs);
		HSSFSheet hs = hw.getSheetAt(0);
		for (int i = 1; i <= hs.getLastRowNum(); i++) {
			int j = 1 ;
			HSSFCell id,Password;
			id = hs.getRow(i).getCell(j);
			Password = hs.getRow(i).getCell(j+1);
			System.out.println(id);
			System.out.println(Password);
			
		}

	}

}
