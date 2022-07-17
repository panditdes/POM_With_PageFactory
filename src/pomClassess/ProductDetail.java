package pomClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetail {

	@FindBy(xpath="//div[text()='realme C11 2021 (Cool Blue, 32 GB)']")
	private WebElement SelectProduct;
	
	
	
	public ProductDetail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void Selectproduct()
	{
		SelectProduct.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


