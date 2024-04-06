package sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfası extends Sayfa{
    public final String emailAdresi = "txtUserName";
    public final String parola = "txtPassword";
    public final String girisYapTusu = "btnLogin";


    public GirisYapSayfası(WebDriver driver) {
        super(driver);
    }
}
