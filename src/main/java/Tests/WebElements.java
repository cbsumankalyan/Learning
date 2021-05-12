package Tests;

import org.testng.annotations.Test;

import POM.Start;
import Utility.SuperTestNG;

public class WebElements extends SuperTestNG {
	
	@Test
	public void Elements() throws InterruptedException {
		
		Start start = new Start(driver);
		
		childtest = WebElements.createNode("<b><font color=407899>"+"Web Elements" + "</font></b>");
		start.ListElements();
		
	}
}
