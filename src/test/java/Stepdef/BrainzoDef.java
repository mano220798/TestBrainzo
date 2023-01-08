package Stepdef;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.BrainzoPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrainzoDef extends BaseClass {
	BrainzoPojo p1;

	@Given("User have to Launch the Brainzo application through chrome browser via using localhost:{int}")
	public void user_have_to_launch_the_brainzo_application_through_chrome_browser_via_using_localhost(Integer int1) {

		launchBrowser();
		loadUrl("http://localhost:3000/");
		max();
		p1 = new BrainzoPojo();
	}

	@When("User click the login button")
	public void user_click_the_login_button() {

		WebElement login = p1.getlogin();
		login.click();

	}

	@When("User have to enter valid username and valid password")
	public void user_have_to_enter_valid_username_and_valid_password() {

		fill(p1.getEmail(), "pdkumar241095@gmail.com");
		fill(p1.getPassword(), "Kdkumar@2124");

	}

	@When("Click login button again")
	public void click_login_button_again() {

		WebElement sub = p1.getSubmit();
		sub.click();

	}

	@Then("User should be in a valid credential page")
	public void user_should_be_in_a_valid_credential_page() {

		System.out.println("In a valid Page");
		driver.close();
	}

	@When("Enter in to the valid page by using valid credentials")
	public void enter_in_to_the_valid_page_by_using_valid_credentials() {

		WebElement login = p1.getlogin();
		login.click();

		fill(p1.getEmail(), "pdkumar241095@gmail.com");
		fill(p1.getPassword(), "Kdkumar@2124");

		WebElement sub = p1.getSubmit();
		sub.click();

		System.out.println("Done2");

	}

	@When("Enter the course name which you want to learn")
	public void enter_the_course_name_which_you_want_to_learn() throws InterruptedException {
		Thread.sleep(2000);
		WebElement st = p1.getSearchtab();
		st.sendKeys("SoftwareTesting");
	}

	@When("Click search icon to search that course")
	public void click_search_icon_to_search_that_course() throws InterruptedException {
		Thread.sleep(10000);
		p1.getSearchicon().click();
	}

	@Then("User should navigate to particular course page")
	public void user_should_navigate_to_particular_course_page() throws InterruptedException {
		System.out.println("User Navigated to Course Page");
		Thread.sleep(10000);
		driver.close();
		
	}
	

	@When("User Select the particular Course")
	public void user_select_the_particular_course() throws InterruptedException {
		WebElement login = p1.getlogin();
		login.click();
		fill(p1.getEmail(), "pdkumar241095@gmail.com");
		fill(p1.getPassword(), "Kdkumar@2124");
		WebElement sub = p1.getSubmit();
		sub.click();

		System.out.println("Done2");

		Thread.sleep(2000);
		p1.getSelectcourse().click();
	}

	@When("User have to click enroll button")
	public void user_have_to_click_enroll_button() throws InterruptedException {
		Thread.sleep(2000);
		p1.getEnroll().click();
	}

	@When("click Show QR from payment dialogbox")
	public void click_show_qr_from_payment_dialogbox() {

		// WebElement element =
		// driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		// driver.switchTo().frame(element);
		// p1.getShowQr().click();
	}

	@Then("User is Enrolled with selected course")
	public void user_is_enrolled_with_selected_course() {
		System.out.println("You are Enrolled");
		driver.close();
	}
	
	@When("User have to login in to application")
	public void user_have_to_login_in_to_application() {
		WebElement login = p1.getlogin();
		login.click();
		fill(p1.getEmail(), "pdkumar241095@gmail.com");
		fill(p1.getPassword(), "Kdkumar@2124");

		WebElement sub = p1.getSubmit();
		sub.click();

		System.out.println("Done3");

	}

	@When("Select the course by click on the course which user wants")
	public void select_the_course_by_click_on_the_course_which_user_wants() {
		fill(p1.getSearchtab(), "SoftwareTesting");
		p1.getSearchicon().click();
		System.out.println("In Course Page");
	}

	@When("Click Start Learning button")
	public void click_start_learning_button() throws InterruptedException {
		Thread.sleep(2000);
		p1.getSelectcourse().click();
		Thread.sleep(2000);
		p1.getStartLearning().click();

	}

	@When("Click on the Video player button")
	public void click_on_the_video_player_button() throws InterruptedException {
		Thread.sleep(2000);
		// p1.getPlayButton().click();

	}

	@When("Add some comments if your user want to share their feedback")
	public void add_some_comments_if_your_user_want_to_share_their_feedback() {
		WebElement cmnt = p1.getComment();

		cmnt.sendKeys("Good Learning , Thanks");
	}

	@When("Click send Button")
	public void click_send_button() {
		p1.getSendComment().click();

	}

	@Then("Comment is Added")
	public void comment_is_added() {
		System.out.println("Comment Added");
		driver.close();
	}

	@When("user have to click the three dots in top right corner of course page")
	public void user_have_to_click_the_three_dots_in_top_right_corner_of_course_page() {
		WebElement login = p1.getlogin();
		login.click();
		fill(p1.getEmail(), "pdkumar241095@gmail.com");
		fill(p1.getPassword(), "Kdkumar@2124");
		WebElement sub = p1.getSubmit();
		sub.click();
		p1.getDropdown().click();
	}

	@When("click logout option from that dropdown")
	public void click_logout_option_from_that_dropdown() {
		p1.getLogout().click();
	}

	@Then("User successfully logged out")
	public void user_successfully_logged_out() {
		System.out.println("Successfully Logged Out");

	}
	
	
}