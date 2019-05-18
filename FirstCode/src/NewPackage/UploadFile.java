package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/upload/");
		d.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Anjali\\Pictures\\Saved Pictures\\download.jpg");

	}

}
