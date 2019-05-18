package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {
	
	@FindBy (name = "txtLoginid")
	WebElement paraname;
	@FindBy ( xpath= "//*[@id=\"txtpassword\"]" )
	WebElement parapassword;
	@FindBy (id = "btnLogin")
	WebElement paraclick;

	
	//By paraclick = By.id("btnLogin");
	//By parapassword = By.xpath("//*[@id=\"txtpassword\"]");
	//By paraname = By.name("txtLoginid");


	public void setUsername(String user) {
		
		//d.findElement(paraname).sendKeys(user);
		paraname.sendKeys(user);
		
		
	}
		public void setPassword(String Password) {
			//d.findElement(parapassword).sendKeys(Password);
			parapassword.sendKeys(Password);
			}
		
		public void clicksave()
		{
			//d.findElement(paraclick).click();
			paraclick.click();
			
		}

}
