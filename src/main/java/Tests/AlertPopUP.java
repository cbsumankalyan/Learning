package Tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import Utility.SuperTestNG;

public class AlertPopUP extends SuperTestNG {
	
	@Test
	public void Alertpopup() {
		
		childtest = AlertPopUP.createNode("<b><font color=407899>\"+\"Alert PopUP\"+\"</font></b>");
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();

	}
}
