package day06_Assertion;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04 extends TestBase {
    // 1) Bir class oluşturun: BestBuyAssertions
//2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
    //          ○ Sayfa URL’inin https://www.bestbuy.com/ ’a esit oldugunu test edin
    //        ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //○ logoTest => BestBuy logosunun görüntülendigini test edin
// ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

        @Test
        public void urlTest(){
            //		○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
            driver.get("https://www.bestbuy.com/");
            String expectedUrl = "https://www.bestbuy.com/";
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl, actualUrl);
        }

        @Test
        public void titleTest () {
            //		○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

            String expectedIcermeyeKelime = "Rest";
            String actualTitle = driver.getTitle();

            Assert.assertFalse(actualTitle.contains(expectedIcermeyeKelime));
        }

        @Test
        public void logoTest () {
            //		○ logoTest => BestBuy logosunun görüntülendigini test edin
            WebElement logoElementi = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));

            Assert.assertTrue(logoElementi.isDisplayed());

        }
        @Test
        public void Frencreich(){
            driver.get("https://www.bestbuy.com/");
            WebElement francaisElementi = driver.findElement(By.xpath("//button[text()='Français']"));
            Assert.assertTrue(francaisElementi.isDisplayed());
        }




        /*
        @Test
        public void FransizcaLinkTesti () {
            //		○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
            WebElement fransizcaLinki = driver.findElement(By.xpath("//*[text()='Français']"));
            Assert.assertTrue(fransizcaLinki.isDisplayed());

        }*/



}