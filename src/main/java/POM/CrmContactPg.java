package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import BaseClass.BaseClass;


public class CrmContactPg extends BaseClass {

	@FindBy(xpath = "//frame[@name='mainpanel']")
	private WebElement frame;
	@FindBy(xpath = "//a[@title='Contacts']")
	private WebElement contact;
	@FindBy(xpath = "//a[@title='New Contact']")
	private WebElement newContact;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='surname']")
	private WebElement lastName;
	@FindBy(xpath = "//select[@name='category']")
	private WebElement Category;
	@FindBy(xpath = "//select[@name ='status']")
	private WebElement status;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='nickname']")
	private WebElement nickname;
	@FindBy(xpath = "(//input[@value='N']) [1]")
	private WebElement radioMail;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;

	public CrmContactPg() {
		PageFactory.initElements(driver, this);
	}

	public void CrmContactPgContactEle() throws InterruptedException {
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.moveToElement(contact).perform();
		Thread.sleep(2000);
		newContact.click();
	}

	public void clickCrmContactPgNewContact() {
		System.out.println("ok");
	}

	public void inpCrmContactPgFirstName() {
		this.firstName.sendKeys("Yogendra");
	}

	public void inpCrmContactPgLastName() {
		this.lastName.sendKeys("Burkul");
	}

	public void selectCategory(String cat) {
		Select s = new Select(Category);
		s.selectByValue(cat);
	}

	public void selectStatus(String stat) {
		Select s = new Select(status);
		s.selectByValue(stat);
	}

	public void inpCrmContactPgPhone() {
		this.phone.sendKeys("9870479447");
	}

	public void inpCrmContactPgEmail() {
		this.email.sendKeys("adityarawat@gmail.com");

	}

	public void inpCrmContactPgNickname() {
		this.nickname.sendKeys("babu");
	}

	public void inpCrmContactPgRadiomailbtn() {
		this.radioMail.click();
	}

	public void clickCrmContactPgSavebtn() {
		this.saveBtn.click();
	}
}
