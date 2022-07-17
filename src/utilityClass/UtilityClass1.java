package utilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass1 {

	
	//Waits
	
	@SuppressWarnings("deprecation")
	public static void implicitlyWait(int time,WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("deprecation")
	public static WebElement explicitWait(WebDriver driver,WebElement element,int time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		
		WebElement elementReturn = wait.until(ExpectedConditions.visibilityOf(element));
		
		return elementReturn;
	}
	
	public static void getData(WebDriver driver,String location,String sheetName,int initialRow,int FinalRow,int Cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("pc location");
		
		WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	}
	
	
	
	//ScrollToElemet
	
//	public static void ScrollToElemet(WebElement element)
//	{
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
