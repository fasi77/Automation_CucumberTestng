package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String productname;
	public Testbase testbase;
	public pageObjectManager pageobjectmanager;
	public GenericUtils genericutils;
	
	public TestContextSetup() throws IOException {
		testbase=new Testbase();
		pageobjectmanager=new pageObjectManager(testbase.WebDrverManager());
		genericutils=new GenericUtils(testbase.WebDrverManager());
	}
	
	
}
