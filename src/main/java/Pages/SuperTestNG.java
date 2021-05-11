package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperTestNG {
	
	public static WebDriver driver;
	public static String url = "http://dev-enroll.unicityqa.com/master/#/start";
	
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	
	public static ExtentTest ScreenShotImage;
	public static ExtentTest ScreenShotBase64;
	public static ExtentTest keys;
	
	public static ExtentTest childtest;
	
	
	@BeforeTest
	public void StartReport() {
		htmlReporter = new ExtentSparkReporter("D:\\India_WH\\Learning\\reports\\Learning.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ScreenShotImage = extent.createTest("<b><font color=407899>"+"Screenshot Image" + "</font></b>");
		ScreenShotBase64 = extent.createTest("<b><font color=407899>"+"Screenshot Base64" + "</font></b>");
		keys = extent.createTest("<b><font color=407899>"+"KeyBoard Keys" + "</font></b>");
		
	}
	
	@BeforeMethod
	public void PreCondition() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
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
