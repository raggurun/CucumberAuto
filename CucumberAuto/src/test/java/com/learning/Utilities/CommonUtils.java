package com.learning.Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.learning.constants.Constants;

public class CommonUtils {

	
	//public static void loadProperties()
	public void loadProperties()
	{
		/*
		 * FileReader fr=null; try { fr = new FileReader("config.properties");
		 * 
		 * } catch(FileNotFoundException e) { e.printStackTrace(); }
		 */
		
		Properties pr = new Properties();
		try
		{
			pr.load(getClass().getResourceAsStream("/config.properties"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Constants.App_URL=pr.getProperty("App_URL");
		Constants.Browser=pr.getProperty("Browser");
		Constants.Username=pr.getProperty("Username");
		Constants.Password=pr.getProperty("Password");
		Constants.Chrome_Driver_Location=pr.getProperty("Chrome_Driver_Location");
		Constants.Firefox_Driver_Location=pr.getProperty("Firefox_Driver_Location");
				
	}
	
}
