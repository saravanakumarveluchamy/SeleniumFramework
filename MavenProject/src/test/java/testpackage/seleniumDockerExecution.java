package testpackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumDockerExecution {
	


	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
	 @Test	
	 public void sample1() throws MalformedURLException {	
	// TODO Auto-generated method stub
		/*
		DesiredCapabilities cap= new DesiredCapabilities();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("https://www.browserstack.com/");
		driver.findElement(By.partialLinkText("Get started free")).click();
		Thread.sleep(5000);
		driver.quit();
		*/
		System.out.println("kumar");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		options.merge(capabilities);
		
		
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver=new RemoteWebDriver(new URL("http://172.17.0.3:4444/wd/hub"),options);
		/////WebDriver driver=new RemoteWebDriver(new URL("http://127.0.0.1:58486"),options);
		
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
         System.out.println("SAmple");
         // Instantiate a ChromeDriver class.     
	//	WebDriver driver=new ChromeDriver();  
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Simple Context Menu", driver.getTitle());
		driver.quit();
		System.out.println("Success");
		
	}

	 @Test	
	 public void sample2() throws MalformedURLException {	
	
		System.out.println("Success");
		
	}


}
