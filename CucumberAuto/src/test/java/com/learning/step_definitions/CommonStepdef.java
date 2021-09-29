package com.learning.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.learning.Utilities.CommonUtils;
import com.learning.constants.Constants;

import io.cucumber.java.Before;

public class CommonStepdef {

	//Launchbrowser

	public static WebDriver driver;
	
	private static final Logger LOGGER = LogManager.getLogger(CommonStepdef.class);

	@Before
	public void beforeScenario()
	{
		LOGGER.info("Execution Started");
		try
		{
			LOGGER.info("Instantiation the CommonUtils");
			CommonUtils cu = new CommonUtils();
			LOGGER.info("Loading the properties file");
			cu.loadProperties();
			LOGGER.info("Checking the driver is NULL or NOT?");
			if(driver==null)
			{
				LOGGER.info("Driver is NULL. Instantiating it!");
				launchBrowser();
			}
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public void launchBrowser() 
	{
		try
		{
			switch (Constants.Browser)
			{
			case "chrome":
				System.setProperty(Constants.Chrome_Driver, Constants.Chrome_Driver_Location);
				LOGGER.info("Launching " + Constants.Browser);
				driver = new ChromeDriver(); 
				break;
			case "firefox":
				System.setProperty(Constants.Firefox_Driver, Constants.Firefox_Driver_Location);
				LOGGER.info("Launching " + Constants.Browser);
				driver = new FirefoxDriver(); 
				break;
			default:
				System.setProperty(Constants.Chrome_Driver, Constants.Chrome_Driver_Location);
				LOGGER.info("Launching " + Constants.Browser);
				driver = new ChromeDriver(); 
				break;
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}








}
