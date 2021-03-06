package Utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperTestNG {
	
	public static WebDriver driver;
	public static String url = "http://dev-enroll.unicityqa.com/master/#/start";
	public static String Authurl = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
	
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	
	public static ExtentTest ScreenShotImage;
	public static ExtentTest ScreenShotBase64;
	public static ExtentTest keys;
	public static ExtentTest WebElements;
	public static ExtentTest SelectDropDown;
	public static ExtentTest AuthenticationPopUP;
	public static ExtentTest AlertPopUP;
	public static ExtentTest ChildBrowserPopup;
	public static ExtentTest CrossBrowserTest;
	
	public static ExtentTest childtest;
	
	
	@BeforeTest
	public void StartReport() {
		htmlReporter = new ExtentSparkReporter("D:\\India_WH\\Learning\\reports\\Learning.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ScreenShotImage = extent.createTest("<b><font color=407899>"+"Screenshot Image" + "</font></b>");
		ScreenShotBase64 = extent.createTest("<b><font color=407899>"+"Screenshot Base64" + "</font></b>");
		keys = extent.createTest("<b><font color=407899>"+"KeyBoard Keys" + "</font></b>");
		WebElements = extent.createTest("<b><font color=407899>"+"Web Elements" + "</font></b>");
		SelectDropDown = extent.createTest("<b><font color=407899>"+"Select Drop Down" + "</font></b>");
		AuthenticationPopUP = extent.createTest("<b><font color=407899>"+"Authentication PopUP"+"</font></b>");
		AlertPopUP = extent.createTest("<b><font color=407899>"+"Alert PopUP"+"</font></b>");
		ChildBrowserPopup = extent.createTest("<b><font color=407899>"+"Child Broser PopUP"+"</font></b>");
		CrossBrowserTest = extent.createTest("<b><font color=407899>"+"Cross Broser Test"+"</font></b>");
		
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void PreCondition(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		} 
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			
		}
		
		else if (browsername.equalsIgnoreCase("IE")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			
		}
	}
	
	@AfterMethod()
	public void PostCondition() {
		
		driver.quit();
	}
	
	@AfterSuite
	public void teardown() {
		extent.flush();
	}

}
