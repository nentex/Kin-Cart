package generales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {


    public static void recognizeElement(String xpath, int tiempo) {
        new WebDriverWait(Launcher.getDriver(), tiempo).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

    }

    public static void click(String xpath) {
        recognizeElement(xpath, 30);
        Launcher.getDriver().findElement(By.xpath(xpath)).click();

    }

    public static void type(String xpath, String text) {
        recognizeElement(xpath, 30);
        WebElement element = Launcher.getDriver().findElement(By.xpath(xpath));
        element.sendKeys(text);

    }


}
