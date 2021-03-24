package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Personaldetlspojo extends BaseClass {
	public Personaldetlspojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="first_name")
	private WebElement Fname ;
	
	@FindBy(id="last_name")
	private WebElement Lname ;
	
	@FindBy(id="address")
	private WebElement address ;
	
	@FindBy(id="cc_num")
	private WebElement cdno;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement mnth;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookbtn;

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCdno() {
		return cdno;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getMnth() {
		return mnth;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}
	
}
