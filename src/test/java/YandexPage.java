import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexPage extends BasePage {
    void goToYandexPage(){
        gotoUrl("https://www.market.yandex.ru/");
    }

    public void clickOnMoscow(){
//        WebElement document = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/noindex/div/div/div[2]/div/div[2]/div[1]/span/span[2]"));
//        document.click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/noindex/div/div/div[2]/div/div[2]/div[1]/span/span[2]")).click();
    }




}
