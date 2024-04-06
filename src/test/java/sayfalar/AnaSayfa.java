package sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa{

    public final String hesabim = "myAccount";
    public final String girisYap= "login";
    public final String urunArama = "[placeholder='Ürün, kategori veya marka ara']";
    public final String aramaCubugu = ".searchBoxOld-M1esqHPyWSuRUjMCALPK";
    public final String sepeteEkle = "#addToCart";
    public final String urun = "[href='/anker-soundcore-r50i-tws-bluetooth-kablosuz-kulaklik-siyah-ios-ve-android-uyumlu-a3949-anker-turkiye-garantili-p-HBCV000049D0S5'] .moria-ProductCard-bOkJXM";
    public final String urunlink = "https://www.hepsiburada.com/anker-soundcore-r50i-tws-bluetooth-kablosuz-kulaklik-siyah-ios-ve-android-uyumlu-a3949-anker-turkiye-garantili-p-HBCV000049D0S5";
    public final String cerez = "#onetrust-accept-btn-handler";
    public final String sepeteGit = ".checkoutui-ProductOnBasketHeader-zdTSacusLu4Cu0LDpmnB > button:nth-of-type(1)";
    public final String urunsil = "#app > div > div > div.basket_container_1Qgsu > div > div.header_wraper_2iOFr > header > div.basket_delete_1U-UX";
    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
