package amazonTest.Homepage;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import PageObjects.homePage;


public class homePageTest extends baseClass{
	
homePage home;

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
