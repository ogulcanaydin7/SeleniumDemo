package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sayfalar.AnaSayfa;
import sayfalar.GirisYapSayfası;


public class SiteTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfası girisYapSayfası;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfası = new GirisYapSayfası(driver);
        driver.get("https://www.hepsiburada.com");
        anaSayfa.elementGörününeKadarBekleCss(anaSayfa.cerez);
        anaSayfa.tusaBasCss(anaSayfa.cerez);
        driver.navigate().refresh();

    }

    @Test
    void hepsiburadaLoginTesti(){


        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myAccount")));
        anaSayfa.elementGörününeKadarBekle(anaSayfa.hesabim);
        anaSayfa.tusaBas(anaSayfa.hesabim);
        //driver.findElement(By.id("myAccount")).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
        anaSayfa.elementGörününeKadarBekle(anaSayfa.girisYap);
        anaSayfa.tusaBas(anaSayfa.girisYap);
        //driver.findElement(By.id("login")).click();

        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUserName")));
        anaSayfa.elementGörününeKadarBekle(girisYapSayfası.emailAdresi);
        girisYapSayfası.alanaYaziYaz(girisYapSayfası.emailAdresi, "aaaaa@hotmail.com");
        //driver.findElement(By.id("txtUserName")).sendKeys("aaaaa@hotmail.com");

        anaSayfa.elementGörününeKadarBekle(girisYapSayfası.parola);
        girisYapSayfası.alanaYaziYaz(girisYapSayfası.parola, "123qwer");

        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnLogin")));
        anaSayfa.elementGörününeKadarBekle(girisYapSayfası.girisYapTusu);
        girisYapSayfası.tusaBas(girisYapSayfası.girisYapTusu);
        //driver.findElement(By.id("btnLogin")).click();
    }

    @Test
    void urunAramaTest(){
        anaSayfa.tusaBasCss(anaSayfa.aramaCubugu);
        anaSayfa.elementGörününeKadarBekleCss(anaSayfa.urunArama);
        anaSayfa.alanaYaziYazCss(anaSayfa.urunArama,"Anker Soundcore R50i");
        anaSayfa.klavyetusunaBas(anaSayfa.urunArama, Keys.ENTER);
        anaSayfa.tusaBasCss(anaSayfa.urun);
    }

    @Test
    void sepeteEklemeSilmeTest(){

        driver.get(anaSayfa.urunlink);
        anaSayfa.elementGörününeKadarBekleCss(anaSayfa.sepeteEkle);
        anaSayfa.tusaBasCss(anaSayfa.sepeteEkle);
        anaSayfa.elementGörününeKadarBekleCss(anaSayfa.sepeteGit);
        anaSayfa.tusaBasCss(anaSayfa.sepeteGit);
        anaSayfa.elementGörününeKadarBekleCss(anaSayfa.urunsil);
        anaSayfa.tusaBasCss(anaSayfa.urunsil);

    }


    @AfterEach
    void tearDown(){
        driver.close();
    }

}
