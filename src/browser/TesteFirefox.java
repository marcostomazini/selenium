package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by tomazini on 8/26/15.
 */
public class TesteFirefox {
    @Test
    public void teste() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://planned.by/quickloja");
    }

}
