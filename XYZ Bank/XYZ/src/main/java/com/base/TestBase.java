package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	public static WebDriver driver;
	public static Properties configProp;
	public TestBase()
	{
		// Reading Configure File.
		try {
			configProp = new Properties();
			FileInputStream readConfigLoc = new FileInputStream(
					"C:\\Users\\91730\\Desktop\\XYZ Bank\\XYZ\\src\\main\\java\\com\\config\\config");
			configProp.load(readConfigLoc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Initializing web browser
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browserName = configProp.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(configProp.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
}
