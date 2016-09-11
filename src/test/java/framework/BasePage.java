package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by barocko on 9/11/2016.
 */
public class BasePage extends ConsiceAPI {

    public WebDriver getWebDriver() {
        return driver;
    }

    public BasePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;
}
