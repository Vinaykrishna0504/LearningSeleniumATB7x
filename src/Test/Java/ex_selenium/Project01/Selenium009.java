package ex_selenium.Project01;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium009 {
    public static void main(String[] args) {

        EdgeOptions edgeOptions = new EdgeOptions();

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }
}
