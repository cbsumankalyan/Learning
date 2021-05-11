package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pages.SuperTestNG;

public class Start extends SuperTestNG {
	
	@FindBy(xpath = "//span[text()='Sign Up']")
	private WebElement SignUP;
	
	public Start (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void KeyBoard() {
		SignUP.click();
		
	}
	

}
