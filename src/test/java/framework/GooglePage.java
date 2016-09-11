package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


/**
 * Created by barocko on 9/11/2016.
 */
public class GooglePage extends BasePage {

    By firstResult=by(".srg .g:nth-child(1)");

    public void visit(){
        open("http://google.com/ncr");
    }

    public void searchMore(String text) {
       $(By.name("q")).sendKeys(text, Keys.ENTER);
    }

    public GooglePage(WebDriver driver){
        super(driver);
    }

    public void followFirstResult(){
        $(firstResult).findElement(by(".r a")).click();
    }
}

