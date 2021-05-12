package Tests;

import org.testng.annotations.Test;
import POM.Start;
import Utility.SuperTestNG;

public class SelectDropDown extends SuperTestNG {
	
	@Test
	public void SelectList() throws InterruptedException {
		
		Start start = new Start(driver);
		
		childtest = SelectDropDown.createNode("<b><font color=407899>"+"Web Elements" + "</font></b>");
		
		start.SelectItem();
		
	}
	
}
