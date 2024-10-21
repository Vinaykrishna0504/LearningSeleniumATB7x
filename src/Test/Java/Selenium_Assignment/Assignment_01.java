package Selenium_Assignment;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_01 {

    @Test
    public void Assignment() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");

        driver.quit();
    }

}
