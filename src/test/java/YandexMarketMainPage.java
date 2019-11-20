import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YandexMarketMainPage extends BasePage {
    void goToYandexPage(){
        gotoUrl("https://www.market.yandex.ru/");
    }

    public void clickOnMoscowOnHeader(){
//        WebElement document = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/noindex/div/div/div[2]/div/div[2]/div[1]/span/span[2]"));
//        document.click();
        getDriver().findElement(By.xpath("/html/body/div[1]/div/div[1]/noindex/div/div/div[2]/div/div[2]/div[1]/span/span[2]")).click();
    }


    public void clickOnRegionInputField() {
        getDriver().findElement(By.xpath("//input[@placeholder=\"Укажите другой регион\"]")).click();
    }

    public void inputNameOfNewRegion(String inputRegion) {
        getDriver().findElement(By.xpath("//input[@placeholder=\"Укажите другой регион\"]")).sendKeys(inputRegion);
    }

    public void selectRegionFromList(int i) {
//        getDriver().findElement(By.xpath("//div[@class=\"region-suggest__list suggest2__content suggest2__content_theme_normal\"]/div["+i+"]")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 2);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//div[@class=\"region-suggest__list suggest2__content suggest2__content_theme_normal\"]/div["+i+"]")));
        element.click();
    }

    public void continueWithNewRegion() {
//        getDriver().findElement(By.xpath("//button[@class=\"button region-select-form__continue-with-new i-bem button_theme_action button_size_m button_js_inited button_hovered_yes\"]")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 2);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//div[@class=\"header2-region-popup\"]/button")));
        element.click();
    }

    public void closePopup() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//div[@class=\"popup2__closer\"]")));
        element.click();
    }
}
