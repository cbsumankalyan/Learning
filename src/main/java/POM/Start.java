package POM;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import Utility.SuperTestNG;

public class Start extends SuperTestNG {
	
	@FindBy(xpath = "//span[text()='Sign Up']")
	private WebElement SignUP;
	
	@FindBy(name = "firstName")
	private WebElement FirstName;
	
	@FindBys(@FindBy (xpath = "//select[@name= 'country']/option"))
	private List<WebElement> markets;
	
	@FindBy(xpath = "//select[@name= 'country']")
	private WebElement SelectMarket;
	
	
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
	
	public void ListElements() throws InterruptedException {
		
		Thread.sleep(10000);
		
		String [] Markets = {
				"Anguilla",
				"Bahamas",
				"Barbados",
				"Bon Air",
				"Canada",
				"Curacao",
				"Dominica",
				"Dominican Republic",
				"Grenada",
				"Guyana",
				"Jamaica",
				"Trinidad And Tobago",
				"Turks & Caico",
				"United States",
				"Usvi"
				
		};
		
		for (int i = 0; i < Markets.length; i++) {
			
			Assert.assertEquals(markets.get(i).getText(), Markets[i]);
			childtest.log(Status.INFO, markets.get(i).getText()+ "--->"+Markets[i]);
		}
		
		
		
	}
	
	public void SelectItem() throws InterruptedException {
		
		Thread.sleep(10000);
		
		Select select = new Select(SelectMarket);
		
		select.selectByValue("BB");
		String value = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		childtest.log(Status.INFO, "By Value--->" +"BB");
		childtest.log(Status.INFO, "<b><font color=red>" + "Screenshot" + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromBase64String(value).build());
		
		select.selectByIndex(4);
		String index = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		childtest.log(Status.INFO, "By Index--->" +"4");
		childtest.log(Status.INFO, "<b><font color=red>" + "Screenshot" + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromBase64String(index).build());
		
		select.selectByVisibleText("Jamaica");
		String text = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		childtest.log(Status.INFO, "By Visible Text--->" +"Jamaica");
		childtest.log(Status.INFO, "<b><font color=red>" + "Screenshot" + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromBase64String(text).build());
		
	}

}
