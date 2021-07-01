package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	
	@Test
	public void facebook() throws MalformedURLException {
		
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"),cap);
		driver.get("https://www.selenium.dev/");
		
	}
}
