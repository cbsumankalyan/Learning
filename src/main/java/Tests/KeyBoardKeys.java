package Tests;

import org.testng.annotations.Test;

import POM.Start;
import Utility.SuperTestNG;

public class KeyBoardKeys extends SuperTestNG {
	
	@Test
	public void Keys() throws InterruptedException {
		
		Start start = new Start(driver);
		
		childtest =keys.createNode("<b><font color=407899>"+"Key Board Keys" + "</font></b>");
		start.KeyBoard();
	}

}
