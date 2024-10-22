package ex_selenium.ex_19102024;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium022 {
    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions();
       // options.addArguments("--start-maximized");
       // options.addArguments("--window-size=800,600");
       // options.addArguments("--guest");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("123.45.678.910:12345");
        options.setCapability("proxy",proxy);

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://whatismyipaddress.com/");
        driver.manage().window().maximize();
    }
}
