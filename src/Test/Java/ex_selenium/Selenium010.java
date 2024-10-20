package ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium010 {

    @Test
    public void testQuitVsClose(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://sdet.live");

        //edgeDriver.close();
        // Close the Current Browser tab Window - not the full browser
        // Closed the window, session id ! = null, Error - Invalid session ID

        edgeDriver.quit();
        // Close all the sessions/windows and stop the browser
    }
}
