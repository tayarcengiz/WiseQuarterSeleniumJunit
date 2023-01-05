package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class c03 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        driver.get("https://the-internet.herokuapp.com/basic_auth");

        Thread.sleep(3000);
        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //
        //Html komutu : https://username:password@URL
        //	Username     : admin
        // 	password      : admin
        //
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //4- Basarili sekilde sayfaya girildigini dogrulayin

        String actualSonucYazisi= driver.findElement(By.tagName("p")).getText();
        String expectedKelime= "Congratulations";

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
        Thread.sleep(3000);
    }

}
