package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.TestBase;

import java.time.Duration;

public class C02_JcAlerts extends TestBase {
    // Gerekli ayarlamalari yapip
    // https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
    // 3 test method'u olusturup her method'da bir JsAlert'e basin
    // Ilgili method'lari kullanin





    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        // 1.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        // Alert'deki yazinin "I am a JS Alert" oldugunu test edelim
        Thread.sleep(3000);
        String actualAlertyazisi = driver.switchTo().alert().getText();
        String expectedAlertYazisi="I am a JS Alert";
        Thread.sleep(3000);
        Assert.assertEquals(expectedAlertYazisi,actualAlertyazisi);

        // OK tusuna basip alert'i kapatalim
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

    @Test
    public void test02() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // 2.alert'e tiklayalim
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();

        // cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        String actualSonucYazisi=driver.findElement(By.xpath("//*[text()='You clicked: Cancel']"))
                .getText();


        String expectedSonucYazisi="You clicked: Cancel";
        Thread.sleep(3000);
        Assert.assertEquals(expectedSonucYazisi,actualSonucYazisi);

    }

    @Test
    public void test03() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // 3.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();

        // Cikan prompt ekranina "Abdullah" yazdiralim ve OK tusuna basarak alert'i kapatalim

        driver.switchTo().alert().sendKeys("Abdullah");
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        // Cikan sonuc yazisinin Abdullah icerdigini test edelim
        String actualSonucYazisi=driver.findElement(By.xpath("//*[@id='result']"))
                .getText();

        String expectedKelime= "Abdullah";

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));


    }


}
