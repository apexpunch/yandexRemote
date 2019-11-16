import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class BasePage {
    private static ChromeDriver driver;

    BasePage(){
        createDriver();
    }


    public void createDriver(){
        if (driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "/chromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }
    }


    public ChromeDriver getDriver(){
        return this.driver;
    }

    public void gotoUrl (String inputUrl){
        getDriver().get(inputUrl);
    }

@After
public void closeBrowser(){
    this.driver.quit();
}


}
