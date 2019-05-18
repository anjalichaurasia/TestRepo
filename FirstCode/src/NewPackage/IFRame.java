package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/guru99home/");
		d.manage().window().maximize(); // to max the screen//
		d.switchTo().frame("a077aa5e");
		Thread.sleep(2000);
d.findElement(By.xpath("html/body/a/img")).click();
		
	}

}
