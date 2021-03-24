package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Selecthotlpojo extends BaseClass {

	public Selecthotlpojo() {
		PageFactory.initElements(dri, this);
	}
	
	@FindBy(id="radiobutton_1")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement cntinuBtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCntinuBtn() {
		return cntinuBtn;
	}
	
}
