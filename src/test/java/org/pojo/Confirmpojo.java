package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Confirmpojo extends BaseClass {
	public Confirmpojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="order_no")
	private WebElement odrNo;

	public WebElement getOdrNo() {
		return odrNo;
	}
	
}
