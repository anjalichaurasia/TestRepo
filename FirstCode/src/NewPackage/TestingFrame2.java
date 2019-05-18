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
import org.openqa.selenium.support.PageFactory;

import com.page.TestPage;

public class TestingFrame2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("E:\\Testcase.xls");
		HSSFWorkbook hw = new HSSFWorkbook(fs);
		HSSFSheet hs = hw.getSheetAt(0);
		for (int i = 1; i <= hs.getLastRowNum(); i++) {
			int j = 1 ;
			HSSFCell id,Password;
			id = hs.getRow(i).getCell(j);
			Password = hs.getRow(i).getCell(j+1);
			//System.out.println(id);//
			//System.out.println(Password);//
			//TestPage mypage = new TestPage();
			
			TestPage mypage = PageFactory.initElements(d, TestPage.class);
			mypage.setUsername(id.toString());
			mypage.setPassword(Password.toString() );
			mypage.clicksave();
			
			//d.findElement(By.name("txtLoginid")).sendKeys(id.toString()); //tostring//
			//d.findElement(By.xpath("//*[@id=\"txtpassword\"]")).sendKeys(Password.toString());
			//d.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			d.switchTo().alert().accept();
			d.findElement(By.name("txtLoginid")).clear();
			d.findElement(By.xpath("//*[@id=\"txtpassword\"]")).clear();
			
		}

	}

}
