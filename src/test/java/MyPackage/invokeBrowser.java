package MyPackage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class invokeBrowser {

	static WebDriver driver;
	String DestFile="C:\\Users\\suraksha\\Desktop\\Screenshots\\";

	
	public static void invokeBrowser() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraksha\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
         
	}

	public void getScreenShot(String result) throws IOException {
		// TODO Auto-generated method stub
		
		try {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		System.out.println("Screen shot Method");
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        System.out.println("Screen shot Method 1");
        FileHandler.copy(SrcFile, new File(DestFile+""+"\\"+result+"Screenshot.png"));
        System.out.println("Screen shot Method 2");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
