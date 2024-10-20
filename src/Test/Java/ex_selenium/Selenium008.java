package ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium008 {

    @Test
    public void testmethod01(){
        //EdgeOptions -> It will help you to set the browser
        // Options to browsers
        // window - size
        // headless mode - means there is no UI -> Advantage - Fast execution
        // full UI mode default - UI browser
        // incognito mode - switch option
        // start max
        // add extension - browsers
        // 100+ options, https, http
        // local storage, file download ?

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,600");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
    }
}
