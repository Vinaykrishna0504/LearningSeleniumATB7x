package ex_selenium.ex_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium029Ebay {

    @Description("Verify Ebay print the prices(iMac)")
    @Test
    public void test_verify_print_imac_prices(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //#gh-ac
        // -> Xpath Selector - //input[@id='gh-ac'], CSS selector -> input[id='gh-ac']
        WebElement searchbox = driver.findElement(By.cssSelector("[id='gh-ac']"));
        searchbox.sendKeys("macmini");

        WebElement searchBoxbutton = driver.findElement(By.cssSelector("[id='gh-btn']"));
        searchBoxbutton.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Find all the titles
        // CSS selector -> s-item__title, -> xpath -> div[@class='s-item__title']/span
        List<WebElement> searchTitles = driver.findElements(By.xpath("// div[@class='s-item__title']/span"));
        // CSS selector -> s-item__price
        List<WebElement> searchTitlePrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        //min -> Loop where
        int size = Math.max(searchTitles.size(),searchTitlePrices.size());
        for (int i = 0;i< size; i++ ){
            System.out.println("Title:" + searchTitles.get(i).getText()+ " || " + "Price:" + searchTitlePrices.get(i).getText());
            System.out.println();

            //Max price or Min price - Print it

        }
    }
}
