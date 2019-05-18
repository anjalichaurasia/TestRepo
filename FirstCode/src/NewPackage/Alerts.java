package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		d.findElement(By.name("txtLoginid")).sendKeys("ABC");
		d.findElement(By.xpath("//*[@id=\"txtpassword\"]")).sendKeys("ABC");
		d.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		d.findElement(By.name("txtLoginid")).clear();
		d.findElement(By.xpath("//*[@id=\"txtpassword\"]")).clear();
	}

	}

