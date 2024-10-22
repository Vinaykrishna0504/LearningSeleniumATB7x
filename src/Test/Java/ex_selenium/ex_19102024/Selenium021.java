package ex_selenium.ex_19102024;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium021 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com"); // HTTPS is mandatory
    }
}
