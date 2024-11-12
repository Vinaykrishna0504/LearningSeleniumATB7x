package ex_selenium.ex_26102024_seleniumwaits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium032 {

    @Description("Verify that with the invalid email and password, Error message should be shown on the app.vwo.com")
    @Test
    public void testVWOLoginNegative() throws InterruptedException {

        // How to find elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGNAME
        // Advanced -> Css Selector, XPath

        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");

        // FindElement -> 1 element first element
        // FindElements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //1. Find the Email inputbox and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement PasswordInputBox = driver.findElement(By.name("password"));
        PasswordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // After 3 seconds error comes
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        // Condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(error_message, "Your email, password, IP address or location did not match"));

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }

}