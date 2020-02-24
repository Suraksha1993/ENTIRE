package ObjectRepositorty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	//@FindBy(id="srchword")
	//WebElement HomeSerachBox;
	
	By HomeSerachBox=By.id("srchword");
	

	public WebElement HomeSerachNox() {
		// TODO Auto-generated method stub
		return driver.findElement(HomeSerachBox);
	}
}
