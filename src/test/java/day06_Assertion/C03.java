package day06_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.TestBase;

import java.time.Duration;

public class C03 extends TestBase {
    static WebDriver driver;



    @Test
    public void test01() {
        // 1.method'da amazon'a gidip, amazona gittigimizi test edin
        driver.get("https://www.amazon.com");

        String expectedKelime = "Amazon";
        String actualTitle = driver.getTitle();

        Assert.assertTrue("Title Amazon icermiyor",actualTitle.contains(expectedKelime));
    }

    @Test
    public void test02() {
        // 2.method'da amazon'da nutella aratip, sonuclarin nutella icerdigini test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String expectedKelime = "Nutella";
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String sonucYazisiStr = sonucYaziElementi.getText();

        Assert.assertTrue(sonucYazisiStr.contains(expectedKelime));

    }

    @Test
    public void test03() {
        // 3.method'da nutella arama sonuc sayisinin 50'den fazla oldugunu test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String sonucYazisiStr = sonucYaziElementi.getText();

        String[] sonucYazisiArr = sonucYazisiStr.split(" ");
        String sonucAdediStr = sonucYazisiArr[2]; // "74"
        int actualSonucAdediInt = Integer.parseInt(sonucAdediStr);

        int expectedAramaSonucusayisi = 50;

        Assert.assertTrue(actualSonucAdediInt>expectedAramaSonucusayisi);

    }

}
