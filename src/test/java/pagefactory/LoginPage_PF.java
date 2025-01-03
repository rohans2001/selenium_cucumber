package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver driver;

	// Elements address
	@FindBy(xpath = "//input[@id='username']")
	WebElement txt_username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_password;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement btn_login;

	@FindBy(xpath = "//a[.='Log out']")
	WebElement btn_logout;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	// implemented methods to handle the application action
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLogin() {
		btn_login.click();
	}

	public void clickLogout() {
		btn_logout.click();
	}
}
