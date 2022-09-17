Welcome to the Project!

This project contains Selenium, Maven and TestNg

Tools required:
1.Eclipse
2.Install maven
3.Install TestNG

Note : Verify chrome version before executing the testcase. We are using Version 105.0.5195.127 and placed driver for this chrome version in Driver folder
If you are using driver one, download chrome driver accordinlgy.

Pre-requisite:
1.Clone the project from github
2.Verify project is cloned properly
3.Selenium jars and chrome drivers are placed inside the project folder
4.You will get the build path errorsto fix that
   Go to - Right click 
   Main project -> Build path -> Configure buildpath
5.Navigate to Libraries tab
6.Delete all the jars which is showing red cross mark
7.Click on Add externalJars button in right side
8.Add all the jars placed in Jar folder inside our Main project

Highlights of this Project:
1.URL is initialized at a Suite level (Using @BeforeSuite Annotation)
2.WebDriver is initialized at class level (Using @BeforeClass Annotation)
3.Implemented Page Object Model, by initializing Page Elements in seperate class
4.Grouped Test Cases based on functionality (Smoke and Regression Test Cases using groups attribute)
5.Created TestNG.xml and run the test cases from TestNG.xml
6.Used OOPs concepts to implement this framework
7.Maven project with TestNG annotations are implemented
8.Implemented this framework using @Data Provider Annotation to handle Test Data

Automation:
TC_01:
1. Url - https://nbl.one 
2.Validated if there is at least 1 quest
3.Validated total number of quest present

TC_02:
1.Url - https://nby.la/rdJuXp
2.Clicked on Skylift link
3.Tried booking IELTS

TC_03:
1.Url - https://nbl.one/listings
2.Clicked on Others section see all link
3.Displayed all the cards for title, price and link[Currently displayed current link url]
Note: If you need all cards link we can navigate to all the cards and we can get current url
4. Displayed total number of cards present


