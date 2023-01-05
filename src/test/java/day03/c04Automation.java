package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class c04Automation {
    public static void main(String[] args) throws InterruptedException {
        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        Thread.sleep(3000);

       // 2- https://www.automationexercise.com/ adresine gidin
      //  3- Sayfada 147 adet link bulundugunu test edin.
       // 4- Products linkine tiklayin
      //  5- special offer yazisinin gorundugunu test edin
       // 6- Sayfayi kapatin
//2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkListesi= driver.findElements(By.tagName("a"));
        if (linkListesi.size()==147){
            System.out.println("Link listesi testi PASSED");
        }else{
            System.out.println("Sayfada "+ linkListesi.size()+" adet link var, test FAILED");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();
        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else {
            System.out.println("Special offer testi FAILED");
        }

        /*
            NoSuchElementException driver findElement ile aradigi bir elemnti
            bulamazsa olusur
         */
        //6- Sayfayi kapatin
        driver.close();
    }
}
