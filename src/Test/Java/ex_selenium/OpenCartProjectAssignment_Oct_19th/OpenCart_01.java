package ex_selenium.OpenCartProjectAssignment_Oct_19th;

import io.qameta.allure.Description;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class OpenCart_01 {

    @Description("Positive TC : Verify that account is registrered successfully")
    @Test
    public void RegisterTC(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
        Assert.assertEquals(driver.getTitle(),"Register Account");

        WebElement FirstName = driver.findElement(By.id("input-firstname"));
        FirstName.sendKeys("Vinay");

        WebElement LastName = driver.findElement(By.id("input-lastname"));
        LastName.sendKeys("Krishna");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("VatbjF@1rsa.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("9876543210");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("12345678910");

        WebElement ConfirmPassword = driver.findElement(By.id("input-confirm"));
        ConfirmPassword.sendKeys("12345678910");

        WebElement radio = driver.findElement(By.name("newsletter"));
        radio.click();

        WebElement Checkbox_Policy = driver.findElement(By.name("agree"));
        Checkbox_Policy.click();

        WebElement Continue = driver.findElement(By.cssSelector(".btn.btn-primary"));
        Continue.click();

        Assert.assertEquals(driver.getPageSource().contains("Your Account Has Been Created!"),true);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
