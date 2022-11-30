package Runner;


import Base.*;
import cucumber.api.*;
import cucumber.api.junit.*;
import io.github.bonigarcia.wdm.*;
import org.junit.runner.*;
import org.openqa.selenium.chrome.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature"
        ,glue = {"Steps"},
        tags="@login",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports/Cucumber.html",
                "html:target/cucumber-reports" }
)

public class Runner extends BaseTest {



}
