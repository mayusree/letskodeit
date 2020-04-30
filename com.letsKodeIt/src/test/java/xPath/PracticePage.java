package xPath;

public class PracticePage {
	
public	String bmwRadioButton = "//input[@id='bmwradio']";
public  String bmwRadioText = "//div[@id='radio-btn-example']//label[1]";
public	String benzRadioButton = "//input[@id='benzradio']";
public  String benzRadioText = "//div[@id='radio-btn-example']//label[2]";
public	String hondaRadioButton = "//input[@id='hondaradio']"; 
public  String hondaRadioText = "//div[@id='radio-btn-example']//label[3]";
	

public	String bmwDropDown = "//option[contains(text(),'BMW')]";
public	String benzDropDown = "//option[contains(text(),'Benz')]";
public	String hondaDropDown = "//option[contains(text(),'Honda')]";
	
public	String colorApple = "//option[contains(text(),'Apple')]";
public	String colorOrange = "//option[contains(text(),'Orange')]";
public	String colorPeach = "//option[contains(text(),'Peach')]";
	
public	String checkBmw = "//div[@id='checkbox-example']//label[1]";
public	String checkBenz = "//div[@id='checkbox-example']//label[2]";
public	String checkHonda = "//input[@id='hondacheck']";
	
}
