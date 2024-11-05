package ex_selenium.ex_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium028 {

    @Description("Verify that free trial is expired message in idrive.com")
    @Test
    public void test_verify_expire_message(){
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.idrive360.com/enterprise/login");
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




        driver.quit();


    }
}
