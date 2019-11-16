import org.junit.After;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class YandexTest extends BasePage {
    @Test
    public void yandexTest () throws InterruptedException {
        YandexPage page = new YandexPage();
        page.gotoYandexPage();
        Thread.sleep(5000);  // Let the user actually see something!

    }





}
