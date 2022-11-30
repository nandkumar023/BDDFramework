package Comon;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
import java.util.function.*;

public class wait {
    static Function<WebDriver,Boolean> testconditioWait;
    static  WebDriverWait wait;

    public static void send(String xpath,String value,WebDriver driver) throws Exception {
        try {
            WebElement ele =driver.findElement(By.xpath(xpath));
            Set<WebElement> s = new HashSet<WebElement>();
            s.add(ele);
            testconditioWait = x-> s.size()>0;
            wait=new WebDriverWait(driver, 15000);
            wait.until(testconditioWait);
            driver.findElement(By.xpath(xpath)).sendKeys(value);
        }
        catch (Exception e){
            throw new Exception("");
        }
    }

    public static void click(String xpath,WebDriver driver) throws Exception {
        try {
            WebElement ele =driver.findElement(By.xpath(xpath));
            Set<WebElement> s = new HashSet<WebElement>();
            s.add(ele);
            testconditioWait = x-> s.size()>0;
            wait=new WebDriverWait(driver, 15000);
            wait.until(testconditioWait);
            driver.findElement(By.xpath(xpath)).click();
        }
        catch (Exception e){
            throw new Exception("");
        }
    }
}
