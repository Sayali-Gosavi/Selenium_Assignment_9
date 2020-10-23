package Assignment;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readProperties {
	
	configPropertiesReader propertyReader; 
	WebDriver d;
	
	@Before
	public void setUp() throws Exception {
		propertyReader = new configPropertiesReader();
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(propertyReader.getUrl());
		d.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		d.quit();
	}

	@Test
	public void test() {
	}

}
