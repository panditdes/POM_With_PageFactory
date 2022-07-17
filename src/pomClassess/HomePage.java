package pomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClass.UtilityClass1;

public class HomePage extends UtilityClass1 {

    WebDriver driver;     //declaring as global so we can use in whole class and not initiate 
	
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement searchField;                   
	//giving xpath by using @FindBy so we will use only emailID and perform action on it.it will reduce rework/retype
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchFieldSelect;
	
	@FindBy(xpath="//img[@title='Flipkart']")       
	private WebElement FilpkartIcon;
	//first time the element will attach to Dom known as early inntialise
	
	@FindBy(xpath="//div[text()='Mobiles']")  
	private WebElement MobileText;
	//it will read easily and not lookin in complex manner
	
//	@FindBy(xpath="((//a[@class='_1arVWX'])[1]")
//	private WebElement ContactUs;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void SearchProduct()
	{
		searchField.sendKeys("Realme");
	}
	
	public void searchSelectedproduct()
	{
		searchFieldSelect.click();
	}
	
	public void GoToHomePage()
	{
		FilpkartIcon.click();
	}
	
	//validation for loginpage
	
	public String IsPageLoaded()
	{
		WebElement element = explicitWait(driver,MobileText,10);
		
		String text = element.getText();
		return text;
	}

	public void AgainSearchProduct()
	{
		searchField.sendKeys("Realme");
	}
	
	
	public void AgainsearchSelectedproduct()
	{
		searchFieldSelect.click();
	}




	



//	public void ClickOnContactUs()
//	{
//		ScrollToElement(ContactUs);
//		ContactUs.click();
//	}
//	
	
	
	
	
}
