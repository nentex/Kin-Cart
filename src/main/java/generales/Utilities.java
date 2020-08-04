package generales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {


    public static void recognizeElement(String xpath, int tiempo) {
        try {
            new WebDriverWait(Launcher.getDriver(), tiempo).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void click(String xpath) {
        recognizeElement(xpath, 30);
        try {
            Launcher.getDriver().findElement(By.xpath(xpath)).click();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void type(String xpath, String text) {
        try {
            recognizeElement(xpath, 30);
            WebElement element = Launcher.getDriver().findElement(By.xpath(xpath));
            element.sendKeys(text);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
