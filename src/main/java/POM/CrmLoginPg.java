package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class CrmLoginPg extends BaseClass{
	@FindBy(xpath="//input[@name='username']") private WebElement userName;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(css=".btn.btn-small") private WebElement loginBtn;
	
	public CrmLoginPg() {
	PageFactory.initElements(driver, this);
	}
	

	public void inpCrmLoginPgUserName(String inputData) {
		this.userName.sendKeys(inputData);
	}
	
	public void inpCrmLoginPgPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickCrmLoginPgLoginBn() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(1000);
	}

}
