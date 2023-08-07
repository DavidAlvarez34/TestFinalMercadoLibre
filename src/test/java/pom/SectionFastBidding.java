package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SectionFastBidding extends Base{
    // Actions actions ;
    public SectionFastBidding(WebDriver driver) {

        super(driver);
        // actions = new Actions(driver);
    }
    By btnSectionBiding = By.xpath("//p[contains(text(),'Ofertas relámpago')]");

    By txtAll = By.xpath("//body/main[@id='root-app']/div[1]/section[1]/a[1]");

    public void clickSubmit() throws InterruptedException {
        Thread.sleep(2000);
        click(btnSectionBiding);


    }
    public void textCompare() throws InterruptedException {
        Thread.sleep(1000);
        isDisplayed(txtAll);
    }

}
