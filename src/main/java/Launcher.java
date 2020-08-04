import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Launcher {

    static WebDriver driver;
    static EventFiringWebDriver eventDriver;

    public static void navigate() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        eventDriver = new EventFiringWebDriver(driver);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void main(String[] args) {
        navigate();
    }

}

