package NewPackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://techcanvass.com/");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Actions myActions =  new Actions(d);
		WebElement ele = d.findElement(By.linkText("Domain Training"));
		
		
		
		//Thread.sleep(2000);
		myActions.moveToElement(ele).build().perform();
		//Thread.sleep(2000);
		WebElement An = d.findElement(By.linkText("Business Analyst + Domain courses"));
		//Thread.sleep(2000);
		myActions.moveToElement(An).build().perform();
		//Thread.sleep(2000);
		WebElement Se =d.findElement(By.linkText("BA Certification with Banking"));
		String b = d.getTitle();
		System.out.println(b);
	Assert.assertEquals("BA Certification with Banking", b);
		
		//Assert.as(b, "BA Certification with Banking");
		Se.click();
	
	}

}


/// Implicits 