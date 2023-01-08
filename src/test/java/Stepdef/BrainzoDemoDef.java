package Stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pom.BrainzoPojodemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrainzoDemoDef extends BaseClass1 {

	BrainzoPojodemo p2;

	public void user_have_to_launch_the_brainzo_application_through_chrome_browser_using_localhost1(Integer int1) {
		launchBrowser();
		loadUrl("http://localhost:3000/");
		maxBrowser();
		p2 = new BrainzoPojodemo();
	}

	@When("User Successfully Navigate to Home page")
	public void user_Successfully_Navigate_to_Home_page() {
		p2.getSignup().isDisplayed();
		System.out.println("WELCOME TO BRAINZO APPLICATION");

	}

	@When("Click the Signup button")
	public void click_the_Signup_button() {
		p2.getSignup().click();

	}

	@When("Enter the Valid EmailAddress in Text field")
	public void enter_the_Valid_EmailAddress_in_Text_field() throws InterruptedException {
		Thread.sleep(2000);
		//p2.getMail().sendKeys("xyz123@gmail.com");
	}

	@When("Click the Submit button")
	public void click_the_Submit_button() {
		p2.getSubmit1().click();

	}

	@When("Enter the OTP that has been sent to Registerd Email Address")
	public void enter_the_OTP_that_has_been_sent_to_Registerd_Email_Address() {
		p2.getOTPText().click();
	}

	@When("Click verify OTP button")
	public void click_verify_OTP_button() throws InterruptedException {

		//Thread.sleep(20000);
		//p2.getVerifyOTP().click();

	}

	@When("User Successfully Entered their OTP for verifciation")
	public void user_Successfully_Entered_their_OTP_for_verifciation() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Learner Signup Form");
	}

	@When("User have to give their First name and Last name in corressponding Text field")
	public void user_have_to_give_their_First_name_and_Last_name_in_corressponding_Text_field() {

		p2.getFnameL().sendKeys("Kumar");
		p2.getLanmeL().sendKeys("K");

	}

	@When("user have to Enter the Phone number in Phone number Text Box")
	public void user_have_to_Enter_the_Phone_number_in_Phone_number_Text_Box() {
		p2.getPhnenumL().sendKeys("9444344439");
	}

	@When("user have to Enter the Password in Password and Confirm Password Text field")
	public void user_have_to_Enter_the_Password_in_Password_and_Confirm_Password_Text_field() {
		p2.getPswdL().sendKeys("Abcd@123");
		p2.getConfrmpswdL().sendKeys("Abcd@123");
	}

	@When("User have to Click the Signup button")
	public void user_have_to_Click_the_Signup_button() {
		p2.getSignupL().click();

	}

	@Then("User Successfully navigate to Login page")
	public void user_Successfully_navigate_to_Login_page() {
		System.out.println("Learner Registeration Successfuly Completed");

	}

	@Given("User have to launch the brainzo application through chrome browser using localhost:{int}")
	public void user_have_to_launch_the_brainzo_application_through_chrome_browser_using_localhost(Integer int1) {
		launchBrowser();
		loadUrl("http://localhost:3000/");
		maxBrowser();
		p2 = new BrainzoPojodemo();

	}

	@When("User get Successfully Navigate to Home page")
	public void user_get_Successfully_Navigate_to_Home_pages() {
		p2.getSignup().isDisplayed();
		System.out.println("WELCOME BACK TO BRAINZO APPLICATION");

	}

	@When("Click the Sign-up button")
	public void click_the_Sign_up_button() {
		p2.getSignup().click();

	}

	@When("Enter the Valid Email-Address in Text field")
	public void enter_the_Valid_Email_Address_in_Text_field() throws InterruptedException {
		Thread.sleep(2000);
		//p2.getMail().sendKeys("xyz1234@gmail.com");

	}

	@When("Click the Submit  button")
	public void click_the_Submit_buttons() {
		p2.getSubmit1().click();

	}

	@When("Enter the OTP that has been sent to Registerd Email-Address")
	public void enter_the_OTP_that_has_been_sent_to_Registerd_Email_Addresss() {
		p2.getOTPText().click();

	}

	@When("Click verify OTP  button")
	public void click_verify_OTP_buttons() throws InterruptedException {
		//Thread.sleep(20000);
		//p2.getVerifyOTP().click();

	}

	@When("User Successfully Entered their OTP for  verifciation")
	public void user_Successfully_Entered_their_OTP_for_verifciations() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Mentor Signup Form");

	}

	@When("User have to give their First-name and Last-name in corressponding Text field")
	public void user_have_to_give_their_First_name_and_Last_name_in_corressponding_Text_fields() {
		p2.getFnameL().sendKeys("Kumar");
		p2.getLanmeL().sendKeys("Kumar");

	}

	@When("user have to Enter the Phone number in Number Text Box")
	public void user_have_to_Enter_the_Phone_number_in_Number_Text_Box() {
		p2.getPhnenumL().sendKeys("9444344439");

	}

	@When("user have to Enter the Password in Password and Confirm Password Text field.")
	public void user_have_to_Enter_the_Password_in_Password_and_Confirm_Password_Text_fields() {
		p2.getPswdL().sendKeys("Abcd@123");
		p2.getConfrmpswdL().sendKeys("Abcd@123");

	}

	@When("User have to Click the Signup button.")
	public void user_have_to_Click_the_Signup_buttons() {
		p2.getSignupL().click();

	}

	@Then("User Successfully navigate to Login page.")
	public void user_Successfully_navigate_to_Login_pages() {
		System.out.println("Mentor Registeration Successfuly Completed");

	}

	@Given("User have to launch the brainzo application through chrome browser via using localhost:{int}")
	public void user_have_to_launch_the_brainzo_application_through_chrome_browser_via_using_localhost(Integer int1) {

		launchBrowser();
		loadUrl("http://localhost:3000/");
		maxBrowser();
		p2 = new BrainzoPojodemo();
	}

	@When("User have to  click the login button")
	public void user_havs_to_click_the_login_button() {
		WebElement login = p2.getlogin();
		login.click();
	}

	@When("User  enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		p2.getEmail().sendKeys("mrdilipp1995@gmail.com");
		p2.getPassword().sendKeys("Kdkumar@2124");

	}

	@When("Click login button once again")
	public void click_login_button_once_again() {
		p2.getLoginagain().click();
	}

	@Then("User should be navigate to Add course page")
	public void user_should_be_navigate_to_Add_course_page() {
		
		System.out.println("Successfully Logged in as Mentor");

	}
	
	  @When("User successfully get login as mentor") public void
	  user_successfully_get_login_as_mentor() {
		  
		  
		  WebElement login = p2.getlogin();
			login.click();
			p2.getEmail().sendKeys("mrdilipp1995@gmail.com");
			p2.getPassword().sendKeys("Kdkumar@2124");
			p2.getLoginagain().click();
	
	  }
	  
	  @When("User has navigate to add course page") public void
	  user_has_navigate_to_add_course_page() throws InterruptedException {
		  Thread.sleep(2000);
		  System.out.println("PLZ ADD THE COURSE DETAILS");
	  
	  }
	  
	  @When("User have to fill the course details in corresponding text field")
	  public void
	  user_have_to_fill_the_course_details_in_corresponding_text_field(){
		
		  p2.getCoursename().sendKeys("DevOps");
		  p2.getCourseDescription().sendKeys("Azure Devops");
		  p2.getCourseFee().sendKeys("500");
		  Select s = new Select(p2.getCourseType());
		  s.selectByVisibleText("Recorded");
		 Select s1 = new Select(p2.getLanguage());
		 s1.selectByVisibleText("English");
		  p2.getCourseImg().sendKeys("/home/dilip/Pictures/Screenshots/Screenshot from 2022-11-12 13-00-25.png");
	  
	  }
	  
	  @Then("Click Addcourse button") public void click_Addcourse_button() {
	 // p2.getAddcoursebtn().click();
	  }
	  
	  
	  @When("Login as learner by providing valid credentials")
	  public void login_as_learner_by_providing_valid_credentials() {
		  WebElement login = p2.getlogin();
			login.click();
			fill(p2.getEmail(), "pdkumar241095@gmail.com");
			fill(p2.getPassword(), "Kdkumar@2124");
			p2.getLoginagain().click();
			
	  }

	  @When("click the dropdown menu option")
	  public void click_the_dropdown_menu_option() {
	     p2.getDropmenu().click();
	  }

	  @When("select the my courses")
	  public void select_the_my_courses() {
		  p2.getMycourses().click();
	      
	  }

	  @Then("courses which are enrolled by learner is displayed")
	  public void courses_which_are_enrolled_by_learner_is_displayed() throws AWTException {
		  System.out.println("COURSES YOU ENROLLED ARE");
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_LEFT);
		  r.keyRelease(KeyEvent.VK_LEFT);
	      
	  }


}