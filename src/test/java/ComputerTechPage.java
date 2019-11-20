import org.openqa.selenium.By;

public class ComputerTechPage extends BasePage {
    void goToComputerTechPage(){
        getDriver().findElement(By.xpath("//span[@class=\"n-w-tab__control-caption\" and contains(.,'Компьютерная техника')]")).click();
    }
}
