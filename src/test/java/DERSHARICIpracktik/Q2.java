package DERSHARICIpracktik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
/* ...Exercise2...
        1 - Driver olusturalim
        2 - Java class'imiza chromedriver.exe'yi tanitalim
        3 - Driver'in tum ekrani kaplamasini saglayalim
        4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        5 - "https://www.otto.de" adresine gidelim
        6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
        8 - Ardindan "https://wisequarter.com/" adresine gidelim
        9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
        kontrol edelim
        10- Bir onceki web sayfamiza geri donelim
        11- Sayfayi yenileyelim
        12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        13- En son adim olarak butun sayfalarimizi kapatmis olalim
                */









        /*
         driver.get("https://www.otto.de");
        String actualOttoTitle= driver.getTitle();
        String actualUrl=driver.getCurrentUrl();
        if (actualOttoTitle.contains("OTTO")){
            System.out.println("Otto Title Test Passed");
        }else {
            System.out.println("Otto Title Test Failed");
        }
        if (actualUrl.contains("OTTO"))
            System.out.println("otto URl test Passed");
        else
            System.out.println("otto Url Test Failed");
        driver.get( "https://wisequarter.com/");
       String expected="Quarter";
       String actualy = driver.getTitle();
       if (actualy.contains(expected)){
           System.out.println("Title testi PASSED");
       }else {
           System.out.println("Title testi FAILE");
       }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();
         */




    }
}
