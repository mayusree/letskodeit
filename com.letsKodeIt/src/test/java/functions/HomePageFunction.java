package functions;

import mainFunction.UtilPage;
import testNGTest.HomePage;
import xPath.PracticePage;

public class HomePageFunction extends UtilPage{
	
	HomePage hp = new HomePage();	
	
	public void clickPracticeButton() {
		
		clickElement(hp.practiceButton);
	}
	
	

}
