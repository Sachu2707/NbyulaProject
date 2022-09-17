package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class UserPage {
	
    public String firstQuest_xpath="(//section[@class='rounded-xl border border-space-30 bg-white p-3 md:p-6'])[1]";
    public String totalQuest_xpath="//section[@class='rounded-xl border border-space-30 bg-white p-3 md:p-6']";
    
    public String others_seeall_xpath="//*[@id='Others']/section/div[1]/div/a/button/span[1]";
    public String totalCards_seeall_xpath="//div[@class='mb-8 mr-1']";
    
    public String totalCards_seeall_title_xpath="//p[@class='text-secondary-200 h-18 break-words text-left font-serif text-base font-semibold -tracking-wider line-clamp-3']";
    
  


}
