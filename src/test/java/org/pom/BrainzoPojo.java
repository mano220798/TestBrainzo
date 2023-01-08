package org.pom;

import org.base.BaseClass;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrainzoPojo extends BaseClass {

	public BrainzoPojo() {

		// super(driver);

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
	private WebElement login;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement Email;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submit;
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-nxo287-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement searchtab;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium css-1kuq5xv-MuiButtonBase-root-MuiIconButton-root']")
	private WebElement searchicon;
	@FindBy(xpath = "//body//div[@id='root']//div//div[1]//div[1]//a[1]//img[1]")
	private WebElement selectcourse;
	@FindBy(xpath = "//button[text()='Enroll']")
	private WebElement enroll;
	@FindBy(xpath = "//input[@id='outlined']")
	private WebElement ShowQr;
	@FindBy(xpath = "//button[@class='Btn-Login text-light course-button']")
	private WebElement startLearning;
	@FindBy(xpath="//*[@id=\"movie_player\"]/div[4]/button")
	private WebElement playButton;
	@FindBy(xpath= "//textarea[@placeholder='Add a comment']")
	private WebElement comment;
	@FindBy(xpath = "//button[text()='SEND']")
	private WebElement sendComment;
	@FindBy(xpath = "//a[@id='collasible-nav-dropdown']//div//*[name()='svg']")
	private WebElement dropdown;
	@FindBy(xpath = "//button[text()='Logout']")
	private WebElement logout;

	public WebElement getlogin() {
		return login;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSearchtab() {
		return searchtab;
	}

	public WebElement getSearchicon() {
		return searchicon;
	}

	public WebElement getSelectcourse() {
		return selectcourse;
	}

	public WebElement getEnroll() {
		return enroll;
	}

	public WebElement getShowQr() {
		return ShowQr;
	}

	public WebElement getStartLearning() {
		return startLearning;
	}

	public WebElement getPlayButton() {
		return playButton;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getSendComment() {
		return sendComment;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLogout() {
		return logout;
	}

}