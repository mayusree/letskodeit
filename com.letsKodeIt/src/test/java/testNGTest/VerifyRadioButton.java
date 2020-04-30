package testNGTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import functions.HomePageFunction;
import functions.PracticePageFunction;
import mainFunction.UtilPage;
import xPath.PracticePage;

public class VerifyRadioButton extends UtilPage{

	PracticePage pp = new PracticePage();
	HomePage hp = new HomePage();
	HomePageFunction hpf = new HomePageFunction();
	PracticePageFunction ppf = new PracticePageFunction();
			
	//public VerifyRadioButton(WebDriver driver) {
		//super(driver);
		
	//}
	//@Test
	public void verifyBmwRadioButton() {
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		ppf.clickBmwRadioButton();
		System.out.println(ppf.getBmwRadioText());
		assertEquals(verifyText("bmw", pp.bmwRadioText), true);
		
				
	}
	
	@Test
	public void verifyAllRadioButtons() {
		
		openBrowser("chrome");
		hpf.clickPracticeButton();
		sleep(2000);
		ppf.clickBmwRadioButton();
		sleep(2000);
		ppf.clickBenzRadioButton();
		sleep(2000);
		ppf.clickHondaRadioButton();
		
	}

}
