package ex_selenium.ex_19102024;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.target.model.SessionID;

public class Selenium019 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");

        //driver.close();
        // Close the Current browser window
       // SessionID ! = NULL;
        // It will not close the full

        // driver.quit();
        // Close all the / Sessions/ windows and stop the browser
        // Session = NULL , Error - Session ID is NULL
    }
}
