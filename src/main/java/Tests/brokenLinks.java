package Tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			
			String url = links.get(i).getAttribute("href");
			
			URL link = new URL(url);
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			httpconn.connect();
			int rescode = httpconn.getResponseCode();
			if (rescode >= 400) {
				System.out.println(url +"--- is Broken Link");
				
			} else  {
				System.out.println(url +"--- is Valid Link");
			}
		}
	}
}
