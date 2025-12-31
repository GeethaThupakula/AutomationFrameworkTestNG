package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//locators
	private By usernameTextBox=By.xpath("//input[@type='email']");
	private By passwordTextBox=By.xpath("//input[@id='Password']");
	private By loginButton=By.xpath("//button[@type='submit']//parent::div[@class='buttons']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterusername(String username) {
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	
	
	
	
	

}
