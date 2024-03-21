package org.step_adoctin;

import java.util.concurrent.TimeUnit;

import org.base_class.Reusable_method;
import org.junit.Assert;
import org.pom_adoctin.Book_a_hotel_pom;
import org.pom_adoctin.Booking_confirmation_pom;
//import org.pom_adoctin.Cancel1_checkbox_pom;
import org.pom_adoctin.Cancelhotel_pom;
//import org.pom_adoctin.Cancel_req_pom;
import org.pom_adoctin.Login_pom;
import org.pom_adoctin.Search_hotelpom;
import org.pom_adoctin.Select_hotelpom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_adoctin extends Reusable_method{

	Login_pom lp=new Login_pom(driver);
	@Given("launch to the browser")
	public void launch_to_the_browser() {
	   geturl("https://adactinhotelapp.com/");
		
	}
	@When("user enter the user name as {string}")
	public void user_enter_the_user_name_as(String string) {
	 
	 send_keys(lp.getUser(), string);
		
	}
	@When("user enter the password as {string}")
	public void user_enter_the_password_as(String string) {
send_keys(lp.getPass(), string);
	}
	@When("user click the login button")
	public void user_click_the_login_button() {
	    click(lp.getLogin());
	}
	@Then("user should navigate to the search hotel page")
	public void user_should_navigate_to_the_search_hotel_page() {
String title = driver.getTitle();
String title1="Adactin.com - Search Hotel";
Assert.assertEquals(title,title1);
	}
	Search_hotelpom sh=new Search_hotelpom(driver);

	@Given("select location")
	public void select_location() {
	   ddindex(sh.getLocation(), 1);
		
	}
	@When("select hotel")
	public void select_hotel() {
	   ddindex(sh.getHotels(), 1);
		
	}
	@When("select romm type")
	public void select_romm_type() {

ddindex(sh.room_typ, 1);
	}
	@When("select room nos")
	public void select_room_nos() {
	ddindex(sh.getRoom_nos(), 2);
		
	}
	@When("select check in date")
	public void select_check_in_date() {
	  
	clear(sh.getDate_pickin());
	send_keys(sh.getDate_pickin(), "04/04/2024");
	}
	@When("select checkout date")
	public void select_checkout_date() {
		clear(sh.getDate_pickout());
		send_keys(sh.getDate_pickout(), "14/04/2024"); 
		
	}
	@When("select adults per room")
	public void select_adults_per_room() {
	ddindex(sh.getAdult_room(), 2);
		
	}
	@When("select childrens per room")
	public void select_childrens_per_room() {
	    
		ddindex(sh.getChild(), 0);
	}
	
	@When("click search button")
	public void click_search_button() {
	  
		click(sh.getSubmit());
	}
	@Then("navigate to the next page")
	public void navigate_to_the_next_page() {
	   String url1="https://adactinhotelapp.com/SelectHotel.php";
	   String currentUrl = driver.getCurrentUrl();
	   Assert.assertEquals(url1, currentUrl);
	}
	Select_hotelpom sh1= new Select_hotelpom(driver);
	
	@Given("user  to click radio_button")
	public void user_to_select_hotel() {
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    click(sh1.getRadio_button());
		
	}

	@When("user  to click continue button")
	public void user_to_click_continue_button() {
	   
		click(sh1.getContinuee());
	}
	@Then("navigate to the book a hotel page")
	public void navigate_to_the_book_a_hotel_page() {
		String actial="https://adactinhotelapp.com/BookHotel.php";
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(actial, currentUrl);
	    //System.out.println("navigated to next page");
	}
	Book_a_hotel_pom bh=new Book_a_hotel_pom(driver);

	@Given("user to enter the first name & last name")
	public void user_to_enter_the_first_name_last_name() {
	    send_keys(bh.getFirstname(), "sureka");
	    send_keys(bh.getLastname(), "boobalan");
		
	}
	@When("user has to enter the adreess")
	public void user_has_to_enter_the_adreess() {
	  send_keys(bh.getAddr(), "vp agilan street,mgr nagar.");
		
	}
	@When("user has to enter the card no")
	public void user_has_to_enter_the_card_no() {
	  
		send_keys(bh.getCardnum(), "1234567887654321");
	}
	@When("select card type,expiry date ,year,& cvv")
	public void select_card_type_expiry_date_year_cvv() {
	    
		ddindex(bh.getCardtype(), 1);
		ddindex(bh.getExpmonth(), 7);
		ddindex(bh.getExp_year(), 18);
		send_keys(bh.getCvv(), "123");
	}
	@When("click book now button")
	public void click_book_now_button() {
	    click(bh.getBooknowbutton());
	}
	@Then("user has to navigate to the next page")
	public void user_has_to_navigate_to_the_next_page() {
	   String actual="https://adactinhotelapp.com/BookHotel.php";
	   String currentUrl = driver.getCurrentUrl();
	   Assert.assertEquals(currentUrl,actual);
	//System.out.println("hh");
	}
	
	Booking_confirmation_pom bcp=new Booking_confirmation_pom(driver);
	
	@Given("scroll down")
	public void scroll_down() {
	   java_script(500);
	}
	@When("click the iteracy button")
	public void click_the_iteracy_button() throws Throwable {
		Thread.sleep(3000);
		click(bcp.getIteracy());
	}



	@Then("navigate to the next page ")
	public void navigate_to_the_next_page1 () {
		String actual="https://adactinhotelapp.com/BookedItinerary.php";
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, actual);
		
	   
	}
	
	Cancelhotel_pom cp=new Cancelhotel_pom(driver);
	
	@Given("click the check box button which is to be cancelled")
	public void click_the_check_box_button_which_is_to_be_cancelled() {
		implicit_wait(10);
	   click(cp.getChech_box());
		
	}
	@When("scrooll down")
	public void scrooll_down() {
	    java_script(500);

	}
	@When("click cancel button")
	public void click_cancel_button() {
	    
		click(cp.getCancel_button());
	}
	@When("click ok in alert popup")
	public void click_ok_in_alert_popup() {
	    // Write code here that turns the phrase above into concrete actions
	   
		simple_alert(true);
	}


	@Then("logout ")
	public void navigate_to_the_next_page11 () throws Throwable {
		
		click(cp.getLogout());
		takscreenshoot("addoctin");
	}
}
