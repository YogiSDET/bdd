package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass;

public class CrmHomePg extends BaseClass{

	@FindBy(xpath = "//select[@name='slctMonth']")
	private WebElement Month;
	
	@FindBy(xpath = "//select[@name='slctMonth']")
	private WebElement Year;
	
	@FindBy(xpath = "//frame[@name='mainpanel']")
	private WebElement frame;
	
	
	public CrmHomePg() {
		PageFactory.initElements(driver, this);
	}
	
	
	private Select selectCategory(WebElement wb) {
		driver.switchTo().frame(frame);
		Select s = new Select(wb);
		return s;
	}
	
	public void getMonthYear(int month, String year) throws InterruptedException {
		Select s =selectCategory(Month);
		s.selectByIndex(month);
		Thread.sleep(2000);
		Select s1 = selectCategory(Year);
		s1.selectByValue(year);
		
		
	}
	
	//div[@id='crmcalendar']//table[@cellpadding='2']//tr//td
	
	public void getDay(String day) throws InterruptedException {
		Thread.sleep(2000);

		
		int size = driver.findElements(By.xpath("//div[@id='crmcalendar']//table[@cellpadding='2']//tr//td")).size();
		for(int i=0;i<size;i++) {	
		driver.findElement(By.xpath("//div[@id='crmcalendar']//table[@cellpadding='2']//tr//td[contains(@onclick,'dayview&day="+day+"')]")).click();
			
//		if() {
//			xy.click();
//			break;
//			}
//		}
	}
	
	}
	
}

