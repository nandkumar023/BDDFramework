package Steps;

import Base.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.chrome.*;

/**
 * @author Nandkumar Babar
 */
public class background  extends BaseTest {

    @Before
    public void setup() throws InterruptedException{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");
    }


    @After
    public void tearDown(){
            driver.quit();
    }

    @Given("^user should be launch the browser$")
    public void userShouldBeLaunchTheBrowser() {

        System.out.println("Intialization is completted...!!");


    }
}
