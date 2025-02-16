package Hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass
{
	
	@Before
	public void browserLaunch() throws Exception {
		launchBrowser();  // here is launch browser
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		// validate if scenario has failed
		if (scenario.isFailed()) {
	
		String screenShotName = scenario.getName().replace(" ", "_");
			System.out.println("failed");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", screenShotName);
		
		}
	}
	
	
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}