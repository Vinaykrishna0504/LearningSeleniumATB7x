package ex_selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium027 {

    @Description("Verify that the error message will come for the wrong email at the free trial for app.vwo.com signup page.")
    @Test
            public void test_error_free_trial(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com/free-trial/");
        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("988szrh463289");
        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        driver.quit();
    }
}
