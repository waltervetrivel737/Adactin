package org.stepdefinetion;

import org.kee.Kee;
import org.kee.PomManager;
import org.kee.kee2;
import org.utilis.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Keer extends BaseClass {
	
	PomManager pref;
	Kee k;
	kee2 k2;
	@Given("user is in Adactin login page")
	public void user_is_in_Adactin_login_page() throws InterruptedException {
		loadurl("http://adactinhotelapp.com/");
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws Throwable{
	    pref = PomManager.getPm();
	    k = pref.getK();
	    totype(k.getUser(), "dhasa8787");
	    totype(k.getPass(), "avengers");
	}

	@When("user click login button")
	public void user_click_login_button() {
	    toclick(k.getLognbtn());
	}

	@Then("user should be in search room details page and quit browser")
	public void user_should_be_in_search_room_details_page_and_quit_browser() {
	    System.out.println("scen1:"+togeturl());
	    
	}
//////////
	@When("user should be in search room details page")
	public void user_should_be_in_search_room_details_page() {
		 System.out.println("scen2:"+togeturl());
	}

	@When("user enter valid place hotel room roomcount checkin checkout and members")
	public void user_enter_valid_place_hotel_room_roomcount_checkin_checkout_and_members() {
	   
		k2 = pref.getK2();
		todropdown(k2.getLoctin(), 2);
		todropdown(k2.getNoRooms(), 2);
		
	}

	@When("user click searchroom button")
	public void user_click_searchroom_button() {
	   System.out.println("succes");
	}

	@Then("user should be in select hotel page and quit browser")
	public void user_should_be_in_select_hotel_page_and_quit_browser() {
	    System.out.println("succes");
	}
	
	
	
	
	
	
	
//	public class Mainclass extends BaseClass {
//		PageObjectManager pageObjectManager;
//		AdactinPage1 adactinPage1;
//		AdactinPage2 adactinPage2;
//		AdactinPage3 adactinPage3;
//		AdactinPage4 adactinPage4;
//
//		@Given("user is in the Adactin Login page")
//		public void user_is_in_the_Adactin_Login_page() {
//			toLoadBrowser();
//			toLoadURL("http://adactinhotelapp.com/");
//		}
//
//		@When("user entered valid {string} and valid {string}")
//		public void user_entered_valid_and_valid(String mailId, String pass) {
//			pageObjectManager = PageObjectManager.getPageObjectManager();
//			adactinPage1 = pageObjectManager.getAdactinPage1();
//
//			toType(adactinPage1.getTxtuser(), mailId);
//			toType(adactinPage1.getTxtPassword(), pass);
//		}
//
//		@When("user clicked Login button")
//		public void user_clicked_Login_button() {
//
//			toclick(adactinPage1.getBtnlogin());
//		}
//
//		@Then("user should be in next page")
//		public void user_should_be_in_next_page() {
//			String url = driver.getCurrentUrl();
//			Assert.assertTrue("check the adactin login Function", url.contains("SearchHotel"));
//		}
//		
//		
//		
//	
//		@When("user entered Location and Hotel")
//		public void user_entered_Location_and_Hotel() throws InterruptedException {
//			adactinPage2 = pageObjectManager.getAdactinPage2();
//			toDropDown(adactinPage2.getHotels(), 1);
//			toDropDown(adactinPage2.getLocation(), 5);
//		}
//		
//
//		@When("user entered Search button")
//		public void user_entered_Search_button() {
//
//			toclick(adactinPage2.getSubmit());
//		}
//
//		@Then("User enter next page")
//		public void user_enter_next_page() {
//			String url = driver.getCurrentUrl();
//		}
//
//		@When("user Selected the Hotel")
//		public void user_Selected_the_Hotel() {
//			adactinPage3 = pageObjectManager.getAdactinPage3();
//			toclick(adactinPage3.getSelect());
//		}
//
//		@When("user clicked continue button")
//		public void user_clicked_continue_button() {
//			toclick(adactinPage3.getBtnContinue());
//		}
//
//		@When("user Entered the Valid Personal details")
//		public void user_Entered_the_Valid_Personal_details() throws InterruptedException {
//			adactinPage4 = pageObjectManager.getAdactinPage4();
//			toType(adactinPage4.getFirstName(), "Acchuthan");
//			toType(adactinPage4.getLastname(), "Thasma");
//			toType(adactinPage4.getAddress(), "Madurai");
//			tosleep(2000);
//			// toType(page4.getCreditCart(), "1234558877875777");
//			toDropDown(adactinPage4.getSelectCard(), 2);
//			toDropDown(adactinPage4.getSelectMonth(), 4);
//			toDropDown(adactinPage4.getSelectYear(), 12);
//			toType(adactinPage4.getCcvNo(), "655");
//			toType(adactinPage4.getCreditCart(), "1234558877875777");
//		}
//
//		@When("user clicked book now")
//		public void user_clicked_book_now() {
//			toclick(adactinPage4.getBookNow());
//		}
//
//		@When("user entered Location and Hotel and {string} and {string}")
//		public void user_entered_Location_and_Hotel_and_and(String inDate, String outDate) {
//			adactinPage2 = pageObjectManager.getAdactinPage2();
//			toDropDown(adactinPage2.getHotels(), 1);
//			toDropDown(adactinPage2.getLocation(), 5);
//			toType(adactinPage2.getCheckinDate(), inDate);
//			toType(adactinPage2.getCheckoutDate(), outDate);
//
//		}
//
//		@Then("user Entered the {string} ,{string},{string},{string},{string}  Valid Personal details")
//		public void user_Entered_the_Valid_Personal_details(String Firstname, String Lastname, String Address,
//				String CreditCardno, String Cvvno) {
//			adactinPage4 = pageObjectManager.getAdactinPage4();
//			toDropDown(adactinPage4.getSelectCard(), 2);
//			toDropDown(adactinPage4.getSelectMonth(), 4);
//			toDropDown(adactinPage4.getSelectYear(), 12);
//			toType(adactinPage4.getFirstName(), Firstname);
//			toType(adactinPage4.getLastname(), Lastname);
//			toType(adactinPage4.getAddress(), Address);
//			toType(adactinPage4.getCreditCart(), CreditCardno);
//			toType(adactinPage4.getCcvNo(), Cvvno);
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
