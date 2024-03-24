package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	@After
	public void closeBrowser() throws IOException {
		testcontextsetup.testbase.WebDrverManager().quit();
	}
	
	@AfterStep
	public void Addscreenshot(Scenario scenario) throws IOException {
		WebDriver driver=testcontextsetup.testbase.WebDrverManager();
		if(scenario.isFailed()) {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		byte[] file=FileUtils.readFileToByteArray(source);
		scenario.attach(file, "image/png", "failure_image");
		}
	}
}
