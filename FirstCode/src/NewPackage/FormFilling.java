package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.bind.v2.runtime.output.NamespaceContextImpl.Element;

public class FormFilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		WebDriverWait wait = new WebDriverWait(d, 2);
		WebElement testlink;
		testlink = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtName")));
		testlink.sendKeys("XYZ");
		testlink = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtMessage")));
		testlink.sendKeys("Anything");
		testlink = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtEmail")));
		testlink.sendKeys("xyz@gmail.com");		

//d.findElement(By.id("txtName")).sendKeys("XYZ");
//d.findElement(By.id("txtEmail")).sendKeys("xyz@gmail.com");
//d.findElement(By.name("txtMessage")).sendKeys("Anything");
		String size = d.findElement(By.xpath("//*[@id=\'form1\']/table/tbody/tr/td/table/tbody/tr[2]/td/div/div/div/table/tbody/tr[1]/td/div/div/table/tbody/tr/td/h5")).getCssValue("font-size");
		System.out.println(size);
d.findElement(By.xpath("//*[@id=\"txtContact\"]")).sendKeys("000000");
Select myselect = new Select (d.findElement(By.id("ddlSubject")));
//myselect.selectByVisibleText("Webinar Enquiry");
myselect.selectByIndex(0);
//myselect.selectByValue("Feedback");
//myselect.selectByVisibleText("Course Enquiry");
d.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();

}
}


// explicits
//cssvalue

