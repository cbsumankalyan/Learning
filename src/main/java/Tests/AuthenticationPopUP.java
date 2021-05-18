package Tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import Utility.SuperTestNG;

public class AuthenticationPopUP extends SuperTestNG {
	
	@Test
	public void Authentication() {
		
		childtest = AuthenticationPopUP.createNode("<b><font color=407899>"+"Authenticaton PopUP" + "</font></b>");
		
		String image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		childtest.log(Status.INFO, "<b><font color=red>" + "Screenshot" + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromBase64String(image).build());
	}

}
