package Tests;

import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Utility.SuperTestNG;

public class Base64ScreenShot extends SuperTestNG {

	@Test
	public void screenshot(Method method) throws IOException {
		
		childtest=ScreenShotBase64.createNode("<b><font color=407899>"+"Screenshot Base64" + "</font></b>");

		String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		childtest.log(Status.INFO, "<b><font color=red>" + "Screenshot" + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotBase64).build());

	}

}
