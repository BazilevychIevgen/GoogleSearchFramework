package framework;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by barocko on 9/11/2016.
 */
public class BaseTest extends ConsiceAPI {

    WebDriver driver = new FirefoxDriver();

    @After
    public void tearDown() {
        driver.quit();
    }
    public WebDriver getWebDriver() {
        return driver;
    }
}
