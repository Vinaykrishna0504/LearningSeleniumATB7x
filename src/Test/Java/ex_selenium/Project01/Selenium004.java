package ex_selenium.Project01;

import org.testng.annotations.Test;

public class Selenium004 {

    @Test
    public void testMethod() {

        // In Selenium 3
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver")

        // In Selenium 4
        // No usage od setProperty

        //Important concepts of OOPS ->
        // Upcasting -> Dynamic Dispatch -> concept of polymorphism

        //      WebDriver driver = new EdgeDriver();
        //    WebDriver driver1 = new ChromeDriver();
        //  WebDriver driver2 = new FirefoxDriver();
        // SearchContext(I)(2) -> WebDriver(I)(10) -> RemoteWebDriver(C)(15) -> ChromiumDriver(C)25 -> EdgeDriver(C)(45)

        // SearchContext - Interface - findElement and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - class - It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver - S

        // Selenium - Architecture - API
        // Create Session, Commands or Functions -> API request to Browser Driver
        // Pass the commands as API

        // SearchContext driver = new ChromeDriver();
        // WebDriver driver1 = new FirefoxDriver();
        // RemoteWebDriver driver = new ChromeDriver();

        // Scenarios
        // 1. Do want to run on Chrome or Edge ?
        // ChromeDriver driver  = new ChromeDriver(); -1% used

        // 2. Do want to run on chrome and then change to Edge ?
        // Webdriver driver1 = new Chromedriver();
        // driver = new EdgeDriver(); 97% used

        // 3. Do want to run on multiple browsers and AWS machine ?
        // RemoterWebDriver driver(with GRID) - Advance(Last 2 Sessions) 2% used

    }
}
