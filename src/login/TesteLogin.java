package login;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by tomazini on 8/26/15.
 */
public class TesteLogin {
    @Test
    public void test() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://planned.by/quickloja");
        driver.manage().window().maximize();

        // localizacao usando fluent
        // localizacao dos elementos por id
        driver.findElement(By.id("usuariologin")).sendKeys("selenium");

        driver.findElement(By.name("usuariosenha")).sendKeys("teste");

        // localizacao por selector
        driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary")).click();

        // Login
        //Assert.assertEquals("Usu??rio ou senha incorretos", driver.findElement(By.cssSelector(".alert.alert-error")).getText());

        driver.findElement(By.partialLinkText("Movimenta")).click();


        driver.findElement(By.partialLinkText("Nova movimenta")).click();

        Select nome = new Select(driver.findElement(By.name("movimentacaotipo")));
        nome.selectByVisibleText("Sa?da");

        //driver.quit();
    }
}
