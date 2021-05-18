package Tests;

import java.util.Set;

import org.testng.annotations.Test;
import Utility.SuperTestNG;

public class ChildBroserPopUP extends SuperTestNG {

	@Test
	public void ChildBroser() {
		
		childtest = ChildBrowserPopup.createNode("<b><font color=407899>"+"Child Broser PopUP"+"</font></b>");
		
		Set<String> childbrowser = driver.getWindowHandles();
		
		for (String cb : childbrowser) {
			
			driver.switchTo().window(cb);
			
			if (driver.getTitle() == "") {
				driver.close();
			}
		}
	}
}
