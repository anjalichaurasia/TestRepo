package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPageFormFilling {
	
	@FindBy (id = "txtName")
	WebElement paraname;
	@FindBy ( xpath= "//*[@id=\"txtContact\"]" )
	WebElement paracontact;
	@FindBy (id = "txtEmail")
	WebElement paraemail;
    @FindBy (name = "txtMessage")
    WebElement paranames;

	public  void setUsername (String User) {
		paraname.sendKeys(User);
	}
	
	public void setEmail(String email) {
		paraemail.sendKeys(email);
		
	}
	public void setmessage(String message) {
		paranames.sendKeys(message);
		
	}
		
	
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		//WebDriver d = new ChromeDriver();
		//d.get("https://techcanvass.com/Contact-Techcanvass.aspx");

//d.findElement(By.id("txtName")).sendKeys("XYZ");
//d.findElement(By.id("txtEmail")).sendKeys("xyz@gmail.com");
//d.findElement(By.name("txtMessage")).sendKeys("Anything");
//d.findElement(By.xpath("//*[@id=\"txtContact\"]")).sendKeys("000000");
//Select myselect = new Select (d.findElement(By.id("ddlSubject")));
//myselect.selectByVisibleText("Webinar Enquiry");
//myselect.selectByIndex(0);
//myselect.selectByValue("Feedback");
//myselect.selectByVisibleText("Course Enquiry");
//d.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();

}
//}

