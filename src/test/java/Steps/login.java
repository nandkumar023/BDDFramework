package Steps;

import Base.*;
import POM.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class login extends BaseTest {
LoginPage lp;


    @Given("User is on login page")
    public void userIsOnLoginPage() throws InterruptedException {

      lp=new LoginPage(driver);
      lp.enterUsername();

        Thread.sleep(5000);

    }

    @Given("User is on password page")
    public void Userisonpasswordpage() throws InterruptedException {

        lp=new LoginPage(driver);
        lp.enterPAssword();
        Thread.sleep(5000);

    }




}
