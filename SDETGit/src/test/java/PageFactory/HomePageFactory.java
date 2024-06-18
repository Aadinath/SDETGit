package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

	WebDriver driver;

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	WebElement cart_logo;

	public void isCartDisplayed() {

		cart_logo.isDisplayed();

	}

	public HomePageFactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
