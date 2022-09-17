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

public class CardScrapping extends UserPage {
	
	public WebDriver driver;
	public String filepath=System.getProperty("user.dir");
	public String url=null;
	 private UserPage user = new UserPage();
	 
  @Test(dataProvider = "dp",priority = 1, groups = { "Regression" })
  public void Tc_01(String username, String password) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
	  driver.findElement(By.xpath(user.others_seeall_xpath)).click();
	  Thread.sleep(3000);
	  
	  List<WebElement> myElements = driver.findElements(By.xpath(user.totalCards_seeall_xpath));
	  System.out.println("Total Cards present : " + myElements.size());
	  int seeall_cards_size=myElements.size();
	  
	  for(int i=1;i<=seeall_cards_size;i++) {
		 String text=driver.findElement(By.xpath("(//p[@class='text-secondary-200 h-18 break-words text-left font-serif text-base font-semibold -tracking-wider line-clamp-3'])["+i+"]")).getText();
		 System.out.println(text);
		 
		 String amt=driver.findElement(By.xpath("(//section[@class='flex h-17 w-full items-center justify-between border-t border-space-30 p-3 md:space-x-2 ']//p)["+i+"]")).getText();
		 System.out.println(amt);
		 System.out.println(driver.getCurrentUrl());
	  }
  
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
	  url="https://nbl.one/listings";
  }

  @AfterSuite
  public void afterSuite() {
  }

}
