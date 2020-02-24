package ObjectRepositorty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	By SignIn=By.linkText("Sign in");
	By UserName=By.id("login1");
	By Password=By.name("passwd");
	By Home=By.linkText("Home");
	
	public WebElement ClickOnSignIn() {
		return driver.findElement(SignIn);
	}
	
	public WebElement UsernameEntered() {
		return driver.findElement(UserName);
	}
	
	public WebElement PasswordEntered() {
		return driver.findElement(Password);
	}
	
	public WebElement ClickOnHome() {
		return driver.findElement(Home);
	}

	
}
