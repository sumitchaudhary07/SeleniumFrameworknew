package sumitframework.basepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import sumitframework.pageobjectmodel.LandingPage;

public class Base {
	WebDriver driver;
	
	
	
	public WebDriver initiateDriver() throws IOException
	{
		
		
		FileInputStream fis=new FileInputStream("\\seleniumframework\\src\\test\\java\\resource\\Global.properties");
		 Properties p=new Properties();
		 p.load(fis);
		System.out.println(p.getProperty("browser")); 
		 
		 
	 driver =new ChromeDriver();
	
	 
	return driver;
	
	}
	

	public LandingPage LaunchApp(WebDriver driver) throws IOException
	{
         
		 
		LandingPage landingpage=new LandingPage(driver);
		
		driver.get("https://www.rahulshettyacademy.com/client/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		return landingpage;
		
	}


}
