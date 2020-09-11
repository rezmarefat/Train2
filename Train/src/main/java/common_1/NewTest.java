package common_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
  public static 
  WebDriver Driver;
  @BeforeClass
  @org.testng.annotations.Parameters ({"url","browser"})
  public void beforeClass(String website,String br) {
	 if(br.equalsIgnoreCase("chrome")) { System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\maven2\\Train\\Drivers\\chromedriver.exe");
	  Driver=new ChromeDriver();
	  Driver.get(website);
	  Driver.manage().window().maximize();
  }
	 else if (br.equalsIgnoreCase("firefox")) 
	 { System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Documents\\maven2\\Train\\Drivers\\geckodriver.exe");
	  Driver=new FirefoxDriver();
	  Driver.get(website);
	  Driver.manage().window().maximize();
		  }
	 else {
		 System.out.println("please cheack name");
	 }
  }
}