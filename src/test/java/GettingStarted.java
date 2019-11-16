import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class GettingStarted {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/chromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.market.yandex.ru/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[2]/span"));
//        searchBox.sendKeys("ChromeDriver");
//        searchBox.submit();
//        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}