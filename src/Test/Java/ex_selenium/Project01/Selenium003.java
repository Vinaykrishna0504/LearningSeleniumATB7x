package ex_selenium.Project01;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium003 {

    @Test
    public void test_001() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();// close the driver
    }
}
