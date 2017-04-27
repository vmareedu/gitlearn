package TestNgDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgJenkis {

	@Test
	public void TC_01()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cgi.com");
		Assert.assertTrue(driver.getTitle().contains("CGI"));
		System.out.println("TestNG xml file executed successfully");
		
	}
	
}
