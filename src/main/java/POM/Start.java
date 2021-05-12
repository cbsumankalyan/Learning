package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Pages.SuperTestNG;

public class Start extends SuperTestNG {
	
	@FindBy(xpath = "//span[text()='Sign Up']")
	private WebElement SignUP;
	
	@FindBy(name = "firstName")
	private WebElement FirstName;
	
	public Start (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void KeyBoard() throws InterruptedException {
		
		Thread.sleep(10000);
		SignUP.click();
		Thread.sleep(10000);
		
		FirstName.sendKeys("a" + Keys.SHIFT + "b");
		
		childtest.log(Status.INFO, "a" + " keys.SHIFT " + "b");
		
		String image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
		childtest.log(Status.INFO, "<b><font color=red>" + "Screenshot" + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromBase64String(image).build());
		
	}
	

}
