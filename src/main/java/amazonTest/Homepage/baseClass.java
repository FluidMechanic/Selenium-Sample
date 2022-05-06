package amazonTest.Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		Reporter.log("----Applictaion is being setup for the execution---");
		System.setProperty("webdriver.chrome.driver","/Users/rahuljaiswal/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		Reporter.log("---Application is all ready for the test exeuction---");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		Reporter.log("--Test Execution has been completed.Closing the Application--");
		driver.quit();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
