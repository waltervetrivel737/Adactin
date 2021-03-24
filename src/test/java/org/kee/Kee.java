package org.kee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Kee extends BaseClass {
	public Kee() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement lognbtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLognbtn() {
		return lognbtn;
	}
	
	
	
}
