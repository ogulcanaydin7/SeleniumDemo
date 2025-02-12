package sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {

    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void elementGörününeKadarBekle(String elementId) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));

    }

    public void elementGörününeKadarBekleCss(String elementId) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementId)));
    }
    public void elementGörününeKadarBekleXpath(String elementId) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementId)));
    }

    public void tusaBas(String tusId) {
        driver.findElement(By.id(tusId)).click();

    }
    public void tusaBasCss(String tusId) {
        driver.findElement(By.cssSelector(tusId)).click();

    }
    public void tusaBasXpath(String tusId) {
        driver.findElement(By.xpath(tusId)).click();

    }

    public void alanaYaziYaz(String elementId, String emailAdresi) {
        driver.findElement(By.id(elementId)).sendKeys(emailAdresi);

    }

    public void alanaYaziYazCss(String elementId, String yazi) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(yazi);

    }
    public void alanaYaziYazXpath(String elementId, String yazi) {
        driver.findElement(By.xpath(elementId)).sendKeys(yazi);

    }

    public void klavyetusunaBas(String elementId, Keys klavyetusu) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyetusu);
    }


}


