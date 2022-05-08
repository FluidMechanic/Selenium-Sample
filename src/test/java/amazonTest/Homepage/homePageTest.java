package amazonTest.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import PageObjects.homePage;


public class homePageTest extends baseClass{

homePage home;




/*homePageTest()

{
	home=PageFactory.initElements(driver, homePage.class);
}
*/
	@BeforeTest
	public void setUp()
	{
		home=new homePage(driver);
	}
	
	@Test(priority=0)
	public void checkLogo()
	{
		home.logoValidate();
	}
	
	@Test(priority=1)
	public void searchProduct()
	{
		
		home.search("Boat HeadPhone");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
