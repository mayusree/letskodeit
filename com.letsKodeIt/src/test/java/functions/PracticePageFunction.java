package functions;

import mainFunction.UtilPage;
import xPath.PracticePage;

public class PracticePageFunction extends UtilPage {
	PracticePage pp = new PracticePage();
	
	public void clickBmwRadioButton() {
				
		clickElement(pp.bmwRadioButton);
				
	}
	
	
	
	public String getBmwRadioText() {
		
	return getText(pp.bmwRadioText);
	
		
	}
		
	public void clickBenzDropDown() {
				
		clickElement(pp.benzDropDown);
		
	}

	public void clickBenzRadioButton() {
		
		clickElement(pp.benzRadioButton);		
		
	}
	
	public void clickColorButton() {
		
		clickElement(pp.colorPeach);
	}
	
	public void clickCheckButton() {
		
		clickElement(pp.checkHonda);
		
	}
	
	public void clickHondaRadioButton() {
		clickElement(pp.hondaRadioButton);
		
	}
	
	
}
