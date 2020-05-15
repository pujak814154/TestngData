package ngpackage;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.*;

public class TestSnapshot {
	 @Test
	    public void testGuru99TakeScreenShot() throws Exception{
			WebDriver driver ; System.setProperty("webdriver.chrome.driver","E:\\Workspace\\Library\\ChromeDriver\\chromedriver.exe");
			  driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/V4/");
	        takeSnapShot(driver, "F://screenshot.png") ;     

	    }
	    public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

	        TakesScreenshot scrShot =(TakesScreenshot)driver;
	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	                File DestFile=new File(fileWithPath);
	                FileUtils.copyFile(SrcFile, DestFile);

	    }
}
