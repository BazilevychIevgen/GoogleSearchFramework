package framework;

import org.junit.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by barocko on 9/10/2016.
 */
public class GoogleTest extends BaseTest {

    GooglePage page = new GooglePage(driver);

    @Test
    public void testSearchText() {
        page.visit();

        page.searchMore("selenium");
        assertThat(textToBePresentInElementLocated(page.firstResult, "Dietary Supplement Fact Sheet:"));

        page.searchMore(" chemical element");
        assertThat(textToBePresentInElementLocated(page.firstResult,
                "Selenium is"));
    }

    @Test
    public void testFollowFirstresult(){
        page.visit();

        page.searchMore("selenium");

        page.followFirstResult();

        assertThat(titleIs("Dietary Supplement Fact Sheet: Selenium — Health Professional Fact Sheet"));


    }
}
