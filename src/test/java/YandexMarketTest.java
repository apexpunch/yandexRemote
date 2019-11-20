import org.junit.Test;

public class YandexMarketTest extends BasePage {

    public static void main(String[] args) {
        try {
            yandexTest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public static void yandexTest() throws InterruptedException {
        YandexMarketMainPage mainPage = new YandexMarketMainPage();
        mainPage.goToYandexPage();
        Thread.sleep(1000);  // Let the user actually see something!
        mainPage.clickOnMoscowOnHeader();
        mainPage.clickOnRegionInputField();
        mainPage.inputNameOfNewRegion("Сан");
        mainPage.selectRegionFromList(1);
        mainPage.continueWithNewRegion();
        mainPage.closePopup();

        ComputerTechPage compTech = new ComputerTechPage();
        compTech.goToComputerTechPage();

        NotebooksPage notebooksPage = new NotebooksPage();
        notebooksPage.goToNotebooksPage();

    }





}
