import org.openqa.selenium.By;

public class NotebooksPage extends BasePage {
    void goToNotebooksPage(){
        getDriver().findElement(By.xpath("//div[@data-zone-name=\"link\" and contains(.,\"Ноутбуки\")]")).click();
    }
}
