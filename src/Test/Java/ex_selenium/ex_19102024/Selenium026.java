package ex_selenium.ex_19102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium026 {

    @Test
    public void testVWOLoginNegative(){
        // ID, ClassName,Name, Link and Partial is done.

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.id("sex-0")).click();

        // TagName and Xpath and CSS selector
    }
}
