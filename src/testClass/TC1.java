package testClass;

import org.openqa.selenium.WebDriver;

import pomClassess.Buy_Now;
import pomClassess.HomePage;
import pomClassess.LogInPage;
import pomClassess.ProductDetail;


public class TC1 {

	static WebDriver driver;
	LogInPage loginpage;
	HomePage homepage;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver= baseClassess.BaseClass1.getWebDriver();

		Thread.sleep(2000);

		TC1 k = new TC1();

		k.VerifyUserLogIn(driver);

		k.VerifyPageLoadedIn10Sec(driver);
		
		k.SelectParticularaProduct(driver);
		
		k.BuyTheProduct(driver);
		
	
		
	}

	public void VerifyUserLogIn(WebDriver driver) throws InterruptedException
	{

		LogInPage loginpage= new LogInPage(driver);  //pass driver as argument

		loginpage.EnterEmailID();

		loginpage.EnterPassword();

		loginpage.ClickOnSubmitButton();

		Thread.sleep(5000);
		
		

	}

	public void VerifyPageLoadedIn10Sec(WebDriver driver) throws InterruptedException

	{
		HomePage homepage = new HomePage(driver);

		homepage.SearchProduct();
		
		homepage.searchSelectedproduct();
		
		Thread.sleep(5000);

		homepage.GoToHomePage();

		String text = homepage.IsPageLoaded();

		if(text.equals("Mobiles"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		homepage.AgainSearchProduct();
		
		homepage.AgainsearchSelectedproduct();
		
		Thread.sleep(5000);
		
	}

	public void SelectParticularaProduct(WebDriver driver) throws InterruptedException 

	{
		

		ProductDetail productdetail = new ProductDetail(driver);
		
		productdetail.Selectproduct();
		
		Thread.sleep(5000);
		
		
	}
	
	public void BuyTheProduct(WebDriver driver) throws InterruptedException 

	{
		Buy_Now buynow = new Buy_Now(driver);

		Thread.sleep(2000);
		
		buynow.SwichToProductAndClick();
		
		Thread.sleep(20000);
		
		buynow.DeliveryAddress();
		
		
		Thread.sleep(2000);
		
		buynow.Continuewithaddress();
		
		Thread.sleep(5000);
		
		buynow.PaymentWithPhonePay();
		
		Thread.sleep(5000);
		
		buynow.EnterPhonePayID();
		
		Thread.sleep(5000);
		
		buynow.EnterUPIID();
		
		Thread.sleep(5000);
		
		buynow.ClickOnVerifyUser();
		
		Thread.sleep(5000);
		
		buynow.SendPaymentRequest();
		
		
		
	}
}
