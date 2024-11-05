package ex_selenium.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium011{

    // get vs navigate.to()

    public static void main(String[] args) throws MalformedURLException {
        WebDriver edgeDriver = new EdgeDriver();
        //edgeDriver.get("https://bing.com");
        // In get we don't have go back, forward allowed

        edgeDriver.navigate().to("https://app.vwo.com");
        edgeDriver.navigate().to(new URL("https://google.com"));
        edgeDriver.navigate().back();
        edgeDriver.navigate().forward();
        edgeDriver.navigate().refresh();
    }



}