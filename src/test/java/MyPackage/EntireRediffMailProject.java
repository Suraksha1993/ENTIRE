package MyPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepositorty.HomePage;
import ObjectRepositorty.RediffLoginPage;

public class EntireRediffMailProject {
	static WebDriver driver;
	
	@Test
	public void RediffUserNamePassword() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraksha\\Desktop\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        driver.get("https://www.rediff.com/");
	        driver.manage().window().maximize();
		
		System.out.println("I am in RediffUserNamePassword ");
		
		RediffLoginPage UsernamePassword =new RediffLoginPage(driver);
		
		UsernamePassword.ClickOnSignIn().click();
		UsernamePassword.UsernameEntered().sendKeys("Suraksha");
		UsernamePassword.PasswordEntered().sendKeys("Jiddewar");
		UsernamePassword.ClickOnHome().click();
		
		}	
	
	@Test
	public void HomePage() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		System.out.println("Home Page");
		Thread.sleep(3000);
	hp.HomeSerachNox().sendKeys("Jackets");
	hp.HomeSerachNox().sendKeys(Keys.ENTER);
	
	

	}
	
	@AfterTest
	public void Done() {
		
		driver.close();
		System.out.println("done");
		
	}
	}


