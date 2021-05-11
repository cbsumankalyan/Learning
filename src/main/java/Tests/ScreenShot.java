package Tests;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import Pages.SuperTestNG;

public class ScreenShot extends SuperTestNG {

	@Test
	public void imgscreenshot(Method method) throws IOException {
		
		childtest=ScreenShotImage.createNode("<b><font color=407899>"+"Screenshot Image" + "</font></b>");
			
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("D:\\India_WH\\Learning\\screenshots\\"+method.getName()+".png");
		FileUtils.copyFile(srcFile, destFile);
		
		childtest.info("Screenshot");
		
		childtest.addScreenCaptureFromPath("D:\\India_WH\\Learning\\screenshots\\"+method.getName()+".png");
		
	}
}
