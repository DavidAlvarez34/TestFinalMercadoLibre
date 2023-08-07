package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Login_Test.feature"},
        glue = {"StepDefinitios"},
        plugin = {"json:target/cucumber.json",
                "pretty", "html:target/cucumber-reports"}// Opciones de reportes, puedes ajustar según tus necesidade
)
//primero extendemos la clase
public class Run extends AbstractTestNGCucumberTests {
}
