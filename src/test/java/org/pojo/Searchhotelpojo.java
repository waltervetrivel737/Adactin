package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Searchhotelpojo extends BaseClass{
	public Searchhotelpojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="location")
	private WebElement loctin;
	
	@FindBy(id="hotels")
	private WebElement hotls;
	
	@FindBy(id="room_nos")
	private WebElement noRooms;
	
	@FindBy(id="datepick_in")
	private WebElement ckin;
	
	@FindBy(id="datepick_out")
	private WebElement ckout;
	
	@FindBy(id="adult_room")
	private WebElement noAdlts;
	
	@FindBy(id="child_room")
	private WebElement nochld;
	
	@FindBy(id="Submit")
	private WebElement sumtBtn;

	public WebElement getLoctin() {
		return loctin;
	}

	public WebElement getHotls() {
		return hotls;
	}

	public WebElement getNoRooms() {
		return noRooms;
	}

	public WebElement getCkin() {
		return ckin;
	}

	public WebElement getCkout() {
		return ckout;
	}

	public WebElement getNoAdlts() {
		return noAdlts;
	}

	public WebElement getNochld() {
		return nochld;
	}

	public WebElement getSumtBtn() {
		return sumtBtn;
	}
	
}
