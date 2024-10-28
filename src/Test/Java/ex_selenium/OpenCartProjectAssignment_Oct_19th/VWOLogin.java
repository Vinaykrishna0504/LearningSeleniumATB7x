package ex_selenium.OpenCartProjectAssignment_Oct_19th;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VWOLogin {

    @Description("Verify Login to - app.vwo.com with valid username and password")
    @Test
    public void LoginTC_Throws_Interrupted_Exception() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("atb7x@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("Atb12345");

        WebElement

    }



}
