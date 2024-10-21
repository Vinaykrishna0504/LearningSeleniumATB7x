package ex_selenium.ex_19102024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Seleniun016 {
    public static void main(String[] args) {

        // Important concept of OOPs in selenium Webdriver ->

   //     WebDriver driver = new EdgeDriver();
   //     WebDriver driver1 = new ChromeDriver();
   //     WebDriver driver2 = new FirefoxDriver();
  //      WebDriver driver3 = new InternetExplorerDriver();
//        WebDriver driver4 = new SafariDriver();

        // SearchContext(I)(2)
        //  -> WebDriver(I)(10)
        // -> RemoteWebDriver(C)(15)
        // -> ChromiumDriver(C)25
        // -> EdgeDriver(C)(45)
        // -> ChromeDriver(C)

        SearchContext driver = new EdgeDriver(); // Dynamic Dispatch(Runtime Polymorphism) / Upcasting
        // Possible but two functions, which is not used much.
        //driver.findElement()
        //driver.findElements()

        //WebDriver driver1 = new EdgeDriver();
        // 12 are available and good

       // RemoteWebDriver driver2 = new EdgeDriver();

      //  EdgeDriver driver1 = new EdgeDriver();

        // Scenarios
        // 1. Do want to run on Chrome or Edge ?
       // ChromeDriver driver1 = new ChromeDriver();
       // EdgeDriver driver2 = new EdgeDriver();

        // 2. Do want to run on Chrome and then change to Edge ?
        WebDriver driver1 = new ChromeDriver();
        driver1 = new EdgeDriver(); // 90%

        // 3. Do you want to run on multiple browsers/ machines ?
        // RemoteWebDriver driver(with GRID) - advance(Last 2 Sessions)


    }
}
