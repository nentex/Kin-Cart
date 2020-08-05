package generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*Class where is set the driver*/

public class Launcher {

    static WebDriver driver;

    public static void navigate() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }
}


