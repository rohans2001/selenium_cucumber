package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPage_PF;

public class LoginSteps_PF {
	
	WebDriver driver=null;
	LoginPage_PF login;
	
	@Given("browser is opend")
	public void browser_is_opend() {
System.out.println("Inside step- browser is open");
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	    driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username,String password) {
		
		login=new LoginPage_PF(driver);
	    login.enterUsername(username);
	    login.enterPassword(password);
	}
	
	@And("user click on login button")
	public void user_click_on_login_button() {
	    login.clickLogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
	    boolean contains = driver.getPageSource().contains("Logged In Successfully");
	    
	    if(contains) {
	    	
	    	login.clickLogout();
	    }
	    else {
			System.out.println("Fail");
		}
	    driver.quit();
	}
}