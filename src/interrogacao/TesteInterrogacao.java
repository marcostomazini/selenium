package interrogacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by tomazini on 8/26/15.
 */
public class TesteInterrogacao {

    @Test
    public void test() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://planned.by/quickloja");

        // localizacao usando fluent
        // localizacao dos elementos por id
        driver.findElement(By.id("usuariologin")).sendKeys("admin");

        // localizacao dos elementos por name
        driver.findElement(By.name("usuariosenha"));

        // localizacao por selector
        driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary"));

        driver.quit();
    }
}
