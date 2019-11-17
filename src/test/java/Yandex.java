import org.junit.Test;

public class Yandex extends BasePage {

    public static void main(String[] args) {
        try {
            yandexTest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void yandexTest() throws InterruptedException {
        YandexPage page = new YandexPage();
        page.goToYandexPage();
        Thread.sleep(5000);  // Let the user actually see something!
        page.clickOnMoscow();
    }





}
