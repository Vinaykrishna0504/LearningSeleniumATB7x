package ex_selenium.Project01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium001 {
    // Code here -> API request -> Browser Driver(Server) .exe, sh -> Browsers(Chrome, Edge)
    // Client and Server
    public static void main(String[] args) {

        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
