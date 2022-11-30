package POM;

import Base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * @author Nandkumar Babar
 */
public class LoginPage extends BaseTest {

    WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//input[@name='email']") private WebElement username;
    @FindBy (xpath = "//input[@name='pass']") private WebElement password;


    public void enterUsername(){
        username.sendKeys("NANDKUMAR BABAR");

    }
    public void enterPAssword(){
        password.sendKeys("Babar@1234");

    }


}
