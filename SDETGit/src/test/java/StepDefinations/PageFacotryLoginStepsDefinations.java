package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageFactory.HomePageFactory;
import PageFactory.loginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFacotryLoginStepsDefinations {

	static WebDriver driver;

	// creating object of loginPageFactory
	loginPageFactory login;
	HomePageFactory homePage;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");

	}

	// @When("User enters valid username and password")
	@When("User  enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions

		login = new loginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions

		login.clickBtn();

	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		// Write code here that turns the phrase above into concrete actions

		// Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"header_container\"]/div[1]/div")).size()>0,"User
		// is at Home Page");

		homePage = new HomePageFactory(driver);
		homePage.isCartDisplayed();

	}

	@And("Close the browser")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions

		driver.close();

	}

}
