import org.testng.annotations.Test;

import pageobjects.UserPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AutomationProj extends UserPage {
	
	public WebDriver driver;
	public String filepath=System.getProperty("user.dir");
	public String url=null;
	 private UserPage user = new UserPage();
	 
  @Test(dataProvider = "dp",priority = 1, groups = { "smoke" })
  public void Tc_01(String username, String password) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  List<WebElement> myElements = driver.findElements(By.xpath(user.totalQuest_xpath));
	  System.out.println("Total quest present : " + myElements.size());
	  Thread.sleep(3000);
	  Assert.assertTrue(driver.findElement(By.xpath(user.firstQuest_xpath)).isDisplayed());
	  System.out.println("First quest is displayed");
	  
	  driver.close();	  
  }
    
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Sample", "Sample" },
    };
  }
  @BeforeClass
  public void beforeClass() {
      System.setProperty("webdriver.chrome.driver", filepath+"\\Driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(url);
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  url="https://nbl.one";
  }

  @AfterSuite
  public void afterSuite() {
  }

}
