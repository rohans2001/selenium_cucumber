package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleScarchSteps {
	
	WebDriver driver= null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step- browser is open");
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@Given("user is on google scarch page")
	public void user_is_on_google_scarch_page() {
		System.out.println("Inside step- user is on google page");
		
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in scarch box")
	public void user_enters_a_text_in_scarch_box() {
		System.out.println("Inside step- user enter a text on scarch box");
		driver.findElement(By.name("q")).sendKeys("selenium java");
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("Inside step- user hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("navigate to scarch result")
	public void navigate_to_scarch_result() {
		System.out.println("Inside step- user navigated to scarch result");
		
		driver.getPageSource().contains("Selenium Tutorial");
		
		driver.close();
	}
}
