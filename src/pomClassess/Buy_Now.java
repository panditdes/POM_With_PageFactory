package pomClassess;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buy_Now {

	WebDriver driver;

	@FindBy(xpath="(//li[@class=\"col col-6-12\"])[2]")
	private WebElement BuyNow;
	
	@FindBy(xpath="//button[text()='Deliver Here']")
	private WebElement DeliveryAddress;

	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement Continue;

	@FindBy(xpath="//label[@for='UPI']")
	private WebElement PhonePayRadio;
	
	@FindBy(xpath="//div[text()='Your UPI ID']")
	private WebElement UPIID;
	
	@FindBy(xpath="//input[@name='upi-id']")
	private WebElement EnterUPIID;
	
	@FindBy(xpath="//div[text()='Verify']")
	private WebElement Verfiy;
	
	@FindBy(xpath="//button[@class='_2KpZ6l TSm6c4 _3AWRsL']")
	private WebElement SendRequestPhonePay;
	

	public  Buy_Now(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	public void SwichToProductAndClick() throws InterruptedException
	{
		String mainpage = driver.getWindowHandle();

		System.out.println(mainpage);


		Set<String> setOfAddresses = driver.getWindowHandles();


		List<String> listOfPopups = new ArrayList<>(setOfAddresses);
		
		System.out.println(listOfPopups);

		int count =setOfAddresses.size();
		
		System.out.println(count);
		
		//driver.switchTo().window(listOfPopups.get(1));

		for (int i=1; i<count;i++)
		{
			driver.switchTo().window(listOfPopups.get(i));

			Thread.sleep(3000);

			System.out.println(driver.getTitle());


			BuyNow.click();
		}

	}
		
		public void DeliveryAddress()
		{			
			DeliveryAddress.click();
		}
		
		
		public void Continuewithaddress()
		{			
			Continue.click();
		}

		public void PaymentWithPhonePay()
		{			
			PhonePayRadio.click();
		}
		
		public void EnterPhonePayID()
		{			
			UPIID.click();
		}
		
		public void EnterUPIID()
		{			
			EnterUPIID.sendKeys("deshpandepandit143@ybl");
		}
		
		public void ClickOnVerifyUser()
		{			
			Verfiy.click();
		}
		
		public void SendPaymentRequest()
		{			
			SendRequestPhonePay.click();
		}
}
