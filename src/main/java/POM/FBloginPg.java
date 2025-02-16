package POM;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class FBloginPg extends BaseClass {
	
	@FindBy(xpath="//input[@id='email']") private WebElement userName;
	@FindBy(xpath="//input[@id='pass']") private WebElement password;
	@FindBy(xpath="//button[@name='login']") private WebElement loginBtn;
	
	public FBloginPg() {
		PageFactory.initElements(driver, this);
	}
	

	public void enterUserName() {
		userName.sendKeys("tok2nitin@gmail.com");
		userName.getText();
		System.out.println(userName.getText());
	}
	
	public void enterPassword() {
		password.sendKeys("Nitin@213");
		System.out.println(password.getText());
	}
	public void clickOnLoginBn() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(10000);
		driver.close();
	}
	
	
}
