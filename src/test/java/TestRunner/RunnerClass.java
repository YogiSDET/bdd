package TestRunner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Feature\\CrmFeature"},
					glue= {"StepDefinations","Hooks"},
					plugin= {"pretty:target/cucumber_pretty.txt",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					publish=true,
					dryRun=false,  // mapping stepdefinitions and feature file
					monochrome=true,
					tags="@loginCrm"
					) 
public class RunnerClass {
	
}	



