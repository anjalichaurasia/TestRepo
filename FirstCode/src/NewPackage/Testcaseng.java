package NewPackage;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testcaseng {
	WebDriver d;
	
  @Test
  public void Test1() {
	  d.findElement(By.id("txtName")).sendKeys("XYZ");
	  d.findElement(By.id("txtEmail")).sendKeys("xyz@gmail.com");
	  d.findElement(By.name("txtMessage")).sendKeys("Anything");
	  d.findElement(By.xpath("//*[@id=\"txtContact\"]")).sendKeys("000000");
	  Select myselect = new Select (d.findElement(By.id("ddlSubject")));
	  
	
	  myselect.selectByIndex(0);
	  String b = d.getTitle();
		System.out.println(b);

Assert.assertEquals("Contact Us - TechCanvass", b);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Software_Testing\\chromedriver_win32\\chromedriver.exe");
		 d = new ChromeDriver();
		d.get("https://techcanvass.com/Contact-Techcanvass.aspx");
  }

  @AfterTest
  public void afterTest() {
	  d.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
	  d.close();
  }

}

