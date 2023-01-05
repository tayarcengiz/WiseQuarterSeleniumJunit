package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ {
    public static void main(String[] args) throws InterruptedException {
        // amazon'a gidip nutella icin arama yapin
        // ilk sayfada cikan urunlerin icerisinde
        // en yuksek fiyati bulun

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        List<WebElement> fiyatlarListesi= driver.findElements(By.className("a-price-whole")) ;

        // WebElement bir obje oldugundan, direk yazdirilamaz
        System.out.println(fiyatlarListesi);

        // Bunun icin for-each loop kullanarak
        // her bir webelement uzerindeki yazilari tek tek yazdirmaliyiz

        for (WebElement each: fiyatlarListesi
        ) {
            System.out.print(each.getText()+" ");
        }

        // en yuksek fiyati bulabilmek icin java bilgimizi kullanmaliyiz
        // 1- web elementlerden getText ile fiyati String olarak alin
        // 2- string fiyati kiyaslama yapabilmek icin Integer'a cevirin
        // 3- en yuksek fiyati bulup yazdirin
        String fiyatstr;
        Integer fiyatint;
        Integer enYuksekFiyat=0;
        for (WebElement each: fiyatlarListesi

        ){
            fiyatstr= each.getText();
            fiyatint=Integer.parseInt(fiyatstr);
           if(fiyatint>enYuksekFiyat ) {
               enYuksekFiyat=fiyatint;
           }

        }
        System.out.println("");
        System.out.println(enYuksekFiyat);


        Thread.sleep(3000);
        driver.close();
    }
}
