package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SectionBindding extends Base{
   // Actions actions ;
    public SectionBindding(WebDriver driver) {

        super(driver);
        // actions = new Actions(driver);
    }
    //autocomplete="do-not-autofill" class="input-tag"
    By InputTextBidding = By.xpath("//a[contains(text(),'Ofertas')]");
    By btnSectionBiding = By.xpath("//p[contains(text(),'Todas las ofertas')]");

    By txtAll = By.xpath("//h1[contains(text(),'Todas')]");
    //Implementar los metodos
    public void seccionActivities() throws InterruptedException {
        Thread.sleep(1000);
        click(InputTextBidding);
    }
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(2000);
        click(btnSectionBiding);


    }
    public void textCompare() throws InterruptedException {
        Thread.sleep(1000);
        isDisplayed(txtAll);


    }
    public void buscaCiudad(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebElement inputField = driver.findElement(By.xpath("//input[@autocomplete='do-not-autofill' and @class='input-tag']")); // Reemplaza "input-id" con el ID del campo de entrada

        // Utilizar el método click() para seleccionar el campo
        inputField.click();
        Thread.sleep(2000);
        inputField.sendKeys("Ciuda");
        Thread.sleep(1000);
        //click(InputTextCity);
        //type("Ciu", InputTextCity);
        //actions.contextClick((WebElement) InputTextCity);

    }

   /* public void ValidateLoginSucces(){
        isDisplayed(lablLoginSucces);
    }*/
}
