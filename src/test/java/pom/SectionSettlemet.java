package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SectionSettlemet extends Base{
    // Actions actions ;
    public SectionSettlemet(WebDriver driver) {

        super(driver);
        // actions = new Actions(driver);
    }
    By btnSectionSettlemet = By.xpath("//p[contains(text(),'Liquidación')]");

    By txtAll = By.xpath("//h1[contains(text(),'Ofertas')]");

    public void clickSubmit() throws InterruptedException {
        Thread.sleep(2000);
        click(btnSectionSettlemet);


    }
    public void textCompare() throws InterruptedException {
        Thread.sleep(1000);
        isDisplayed(txtAll);
    }
}
