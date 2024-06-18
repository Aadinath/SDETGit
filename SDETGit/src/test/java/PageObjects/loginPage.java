package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	WebDriver driver;
	
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By login_btn = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");

	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername (String username) {
		
		
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPassword (String password) {
		
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void click_lg_btn () {
		
		driver.findElement(login_btn).click();
		
	}
	
	public List<WebElement> check_logo() {
		List<WebElement> logo_ele = driver.findElements(lbl_logo);
		return logo_ele;
	}
	
	
}

