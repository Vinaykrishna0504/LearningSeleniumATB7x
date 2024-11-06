package ex_selenium.ex_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium028iDrive {

    @Description("Verify that free trial is expired message in idrive.com")
    @Test
    public void test_verify_expire_message(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //<input
        // _ngcontent-ecu-c4="" autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">

        WebElement username_input_id = driver.findElement(By.id("username"));
//        WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id='username'"));
//        WebElement username_input_css = driver.findElement(By.cssSelector("input[id='username'"));
//        WebElement username_input_css_01 = driver.findElement(By.cssSelector("input#username"));
//        WebElement username_input_css_02 = driver.findElement(By.cssSelector("#username"));
//        WebElement username_input_name = driver.findElement(By.name("username"));

        username_input_id.sendKeys("augtest_040823@idrive.com");

        WebElement password_input_xpath = driver.findElement(By.xpath("//input[@id='password']"));
        password_input_xpath.sendKeys("123456");

        WebElement span_with_id = driver.findElement(By.className("id-checkmark"));
        span_with_id.click();

          WebElement signin_button = driver.findElement(By.cssSelector(("div.id-frm-btnblk > button")));
         signin_button.click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message_free_trial= driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(error_message_free_trial.getText(), "Your free trial has expired");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();


    }
}
