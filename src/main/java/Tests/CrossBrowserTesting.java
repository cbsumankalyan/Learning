package Tests;

import org.testng.annotations.Test;
import Utility.SuperTestNG;

public class CrossBrowserTesting extends SuperTestNG {
	
	@Test
	public void CB () {
		childtest = CrossBrowserTest.createNode("<b><font color=407899>"+"Cross Broser Test"+"</font></b>");
	}
	

}
