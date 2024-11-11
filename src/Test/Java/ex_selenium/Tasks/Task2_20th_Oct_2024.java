package ex_selenium.Tasks;

import io.qameta.allure.Description;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_20th_Oct_2024 {

    @Description("Verify app.vwo.com with valid username and password")
    @Test
    public void test_verify_app_vwo_login_page(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement EmailInputbox = driver.findElement(By.cssSelector("input[id='login-username']"));
        EmailInputbox.sendKeys("vinaykrishna@gmail.com");

        WebElement PasswordInputbox = driver.findElement(By.xpath("//input[@id='login-password']"));
        PasswordInputbox.sendKeys("Vinay@1234");

        WebElement sign_in_buttonbox = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        sign_in_buttonbox.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement dashboard_heading = driver.findElement(By.cssSelector("h1[class='page-heading']"));
        System.out.println(dashboard_heading.getText());

        Assert.assertEquals(dashboard_heading.getText(),"Dashboard");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
