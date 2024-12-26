package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By txt_username= By.xpath("//input[@id='username']");
	By txt_password= By.xpath("//input[@id='password']");
	By btn_login=By.xpath("//button[@id='submit']");
	By btn_logout=By.xpath("//a[.='Log out']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	public void clickLogout() {
		driver.findElement(btn_logout).click();
	}
//	public void loginValidUser(String username,String password) {
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password);
//		driver.findElement(btn_login).click();
//	}
}
