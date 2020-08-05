package generales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Utilities extends Launcher{


    public static void recognizeElement(String xpath, int tiempo) {
        new WebDriverWait(driver, tiempo).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

    }

    public static void click(String xpath) {
        recognizeElement(xpath, 30);
        driver.findElement(By.xpath(xpath)).click();

    }

    public static void type(String xpath, String text) {
        recognizeElement(xpath, 30);
        driver.findElement(By.xpath(xpath)).sendKeys(text);

    }

    public static boolean checkElementisEnabled(String xpath){
        try {
            recognizeElement(xpath,10);
            return driver.findElement(By.xpath(xpath)).isEnabled();

        }catch (Exception e){
            return false;
        }
    }


    public static void quitDriver() throws IOException {
        driver.quit();
        Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
    }

}
