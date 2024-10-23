package ex_selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium024Project {
    // Locators - Find the Web elements
    // Project #1 - TC(Negative) - Invalid username, pass - Error message
    // Open the URL app.vwo.com/#/login(https://app.vwo.com/#/login)
    // find the email id** and enter the email as admin@admin.com
    // find the password inputbox** and enter password as admin
    // find and click on the submit button
    // verify that the error message is shown "Your Email, password, ID Address or location

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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }


}
