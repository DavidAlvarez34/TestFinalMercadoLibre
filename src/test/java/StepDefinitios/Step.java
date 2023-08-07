package StepDefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import pom.SectionBindding;
import pom.SectionFastBidding;
import pom.SectionSettlemet;

@CucumberOptions(publish = true)
public class Step extends TestCase {
    //declarar mi driver
    private WebDriver driver;
    //invocar mis pages necesarios


    SectionBindding sectionBindding;
    SectionFastBidding sectionFastBidding;
    SectionSettlemet sectionSettlemet;


//Section de ofertas
    @Given("usuario ingresa a la pagina de mercado libre")
    public void usuarioIngresaALaPaginaDeMercadoLibre() {
        sectionBindding = new SectionBindding(driver);
        driver = sectionBindding.chromeDriverConnection();
        sectionBindding.visit("https://www.mercadolibre.com.mx/");


    }
    @When("usuario ingresa a la seccion de ofertas")
    public void usuarioIngresaALaSeccionDeOfertas() throws InterruptedException {

        sectionBindding.seccionActivities();
    }

    @And("click en todas las ofertas")
    public void clickEnTodasLasOfertas() throws InterruptedException {
        sectionBindding.clickSubmit();
    }

    @Then("Todas las ofertas se visualizan")
    public void todasLasOfertasSeVisualizan() throws InterruptedException {
        sectionBindding.textCompare();

    }

    //ofertas relampago
    @And("click en ofertas relampago")
    public void clickEnOfertasRelampago() throws InterruptedException {
        sectionFastBidding = new SectionFastBidding(driver);
        sectionFastBidding.clickSubmit();
    }

    @Then("Todas las ofertas relampago se visualizan")
    public void todasLasOfertasRelampagoSeVisualizan() throws InterruptedException {
        sectionBindding.textCompare();
    }
    //Liquidacionj
    @And("click en todas en Liquidacion")
    public void clickEnTodasEnLiquidacion() throws InterruptedException {
        sectionSettlemet = new SectionSettlemet(driver);
        sectionSettlemet.clickSubmit();
    }

    @Then("Todos los productos se muestran")
    public void todosLosProductosSeMuestran() throws InterruptedException {
        sectionSettlemet.textCompare();
    }

}
