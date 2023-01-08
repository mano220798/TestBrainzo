package org.pom;

import org.base.BaseClass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrainzoPojodemo extends BaseClass1 {
	
	public BrainzoPojodemo() {
		
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath = "(//a[normalize-space()='SignUp'])[1]")
	private WebElement Signup;
	
	@FindBy(xpath = "//input[@placeholder=' ']")
	private WebElement mail;//
	@FindBy(xpath = "(//button[text()='Submit'])[1]")
	private WebElement submit1;
	@FindBy(xpath = "//input[@placeholder=' ']")
	private WebElement OTPText;
	@FindBy(xpath = "//button[text()='Verify OTP']")
	private WebElement VerifyOTP;
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fnameL;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lanmeL;
	@FindBy(xpath = "//input[@name='mobilenumber']")
	private WebElement phnenumL;
	@FindBy(xpath = " //input[@name='password']")
	private WebElement pswdL;
	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement ConfrmpswdL;
	@FindBy(xpath = "//button[@id='Btn-Submit']")
	private WebElement signupL;
	
	@FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
	private WebElement login;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement Email;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath = "//button[@id='Btn-Login']")
	private WebElement Loginagain;
	@FindBy(name= "courseName")
	private WebElement Coursename;
	@FindBy(xpath = "//textarea[@placeholder='Description']")
	private WebElement CourseDescription;
	@FindBy(xpath = "//input[@placeholder='Enter course fee']")
	private WebElement CourseFee;
	@FindBy(xpath = "//select[@name='courseType']")
	private WebElement CourseType;
	@FindBy(xpath = "//select[@name='language']")
	private WebElement Language;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement CourseImg;
	@FindBy(xpath = "//button[@id='Btn-Add']")
	private WebElement Addcoursebtn;
	@FindBy(xpath = "//a[@id='collasible-nav-dropdown']//div//*[name()='svg']")
	private WebElement dropmenu;
	@FindBy(xpath = "//a[@href='#/mycourse']")
	private WebElement mycourses;
	
	
	
	public WebElement getSignup() {
		return Signup;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getSubmit1() {
		return submit1;
	}
	public WebElement getOTPText() {
		return OTPText;//
	}
	public WebElement getVerifyOTP() {
		return VerifyOTP;
	}
	public WebElement getFnameL() {
		return fnameL;
	}
	public WebElement getLanmeL() {
		return lanmeL;
	}
	public WebElement getPhnenumL() {
		return phnenumL;
	}
	public WebElement getPswdL() {
		return pswdL;
	}
	public WebElement getConfrmpswdL() {
		return ConfrmpswdL;
	}
	public WebElement getSignupL() {
		return signupL;
	}
	public WebElement getlogin() {
		return login;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLoginagain() {
		return Loginagain;
	}
	public WebElement getCoursename() {
		return Coursename;
	}
	public WebElement getCourseDescription() {
		return CourseDescription;
	}
	public WebElement getCourseFee() {
		return CourseFee;
	}
	public WebElement getCourseType() {
		return CourseType;
	}
	public WebElement getLanguage() {
		return Language;
	}
	public WebElement getCourseImg() {
		return CourseImg;
	}
	public WebElement getAddcoursebtn() {
		return Addcoursebtn;
	}
	public WebElement getDropmenu() {
		return dropmenu;
	}
	public WebElement getMycourses() {
		return mycourses;
	}

}
