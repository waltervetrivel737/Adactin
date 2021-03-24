package org.stepdefinetion;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.pojo.Loginpojo;
import org.pojo.Personaldetlspojo;
import org.pojo.PomManager;
import org.pojo.Searchhotelpojo;
import org.pojo.Selecthotlpojo;
import org.utilis.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainProg extends BaseClass {

	PomManager p;
	Loginpojo p1;
	Searchhotelpojo p2;
	Selecthotlpojo p3;
	Personaldetlspojo p4;

	@Given("User is in Adactin login page.")
	public void user_is_in_Adactin_login_page() {
		loadurl("https://adactinhotelapp.com/");
	}

	@When("User enters Login detials and clicks login.")
	public void user_enters_Login_detials_and_clicks_login(io.cucumber.datatable.DataTable dt) {
		p = PomManager.getPom();
		p1 = p.getLgnpojo();
		List<String> list = dt.asList();
		String name = list.get(0);
		String pass = list.get(1);
		totype(p1.getUser(), name);
		totype(p1.getPass(), pass);
		toclick(p1.getLognbtn());

	}

	@When("User selects location, hotel type and nof rooms.")
	public void user_selects_location_hotel_type_and_nof_rooms() {
		p2 = p.getSrchhotl();
		todropdown(p2.getLoctin(), 2);
		todropdown(p2.getHotls(), 1);
		todropdown(p2.getNoRooms(), 1);
	}

	@When("User enters checkin & checkout dates and nof person per room and click search.")
	public void user_enters_checkin_checkout_dates_and_nof_person_per_room_and_click_search() {
		toclear(p2.getCkin());
		totype(p2.getCkin(), "18/03/2021");
		toclear(p2.getCkout());
		totype(p2.getCkout(), "20/03/2021");
		todropdown(p2.getNoAdlts(), 1);
		todropdown(p2.getNochld(), 1);
		toclick(p2.getSumtBtn());
	}

	@When("User selects the hotel and continues.")
	public void user_selects_the_hotel_and_continues() {
		p3 = p.getSelthtl();
		toclick(p3.getRadiobtn());
		toclick(p3.getCntinuBtn());
	}

	@When("User enters personal detials and clicks book now.")
	public void user_enters_personal_detials_and_clicks_book_now() {

		p4 = p.getPersnldtls();
		totype(p4.getFname(), "walter");
		totype(p4.getLname(), "vetri");
		totype(p4.getAddress(), "greens@600100");
		totype(p4.getCdno(), "1234567891234567");
		todropdown(p4.getCtype(), 2);
		todropdown(p4.getMnth(), 5);
		todropdown(p4.getYear(), 5);
		totype(p4.getCvv(), "123");
		toclick(p4.getBookbtn());
	}

	@Then("User with booking order screenshort.")
	public void user_with_booking_order_screenshort() {
		System.out.println("succes");
	}

}
