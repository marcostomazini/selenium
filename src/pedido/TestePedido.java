package pedido;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by tomazini on 8/26/15.
 */
public class TestePedido {
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

        driver.findElement(By.linkText("Novo pedido")).click();

        driver.findElement(By.linkText("Itens do pedido")).click();

        driver.findElement(By.id("produtonome")).sendKeys("camisa");

        WebDriverWait await = new WebDriverWait(driver, 100);

        //Camisa Gant The Banker Rosa
        await.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.cssSelector("li[data-value='Camisa Gant The Banker Rosa']")));

        driver.findElement(By.cssSelector("li[data-value='Camisa Gant The Banker Rosa']")).click();

        driver.findElement(By.id("produtoquantidade")).sendKeys("1");

        driver.findElement(By.id("adicionar")).click();

        //driver.quit();
    }
}
