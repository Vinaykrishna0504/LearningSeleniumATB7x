package ex_selenium.ex_19102024;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium017 {
    public static void main(String[] args) {

        // Selenium 3.0 - JSON WIRE Protocol
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        // ChromeDriver driver = new ChromeDriver();
        // driver.get("https://sdet.live");


       //  Selenium 4.0 - Selenoum Manager - W3C Protocol

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");

    }
}