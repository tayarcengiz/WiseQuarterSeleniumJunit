package DERSHARICIpracktik;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.TestBase;

public class Q01_31AralikAysehoca extends TestBase {
    //              ..Exercise2...
//   'a gidin,
//  Sayfa basliginin "Best" icerdigini(contains) dogrulayin
//  Ayrica Relative Locator kullanarak;
//      logoTest => BestBuy logosunun goruntulenip goruntulenmedigini dogrulayin
//  Ayrica Relative Locator kullanarak;
//      mexicoLinkTest => Linkin goruntulenip goruntulenmedigini dogrulayin
      @Before
      public void beforetest01(){
          driver.get("http://www.bestbuy.com");

      }


    @Test
    public void Titletest02 (){
        driver.get("http://www.bestbuy.com");
         String expTitle = "Best";
         String actualtitle=driver.getTitle();
        Assert.assertTrue(actualtitle.contains(expTitle));

    }
       @Test
     public void Logotest03 (){
          // logoTest => BestBuy logosunun goruntulenip goruntulenmedigini dogrulayin
           WebElement helloheading=  driver.findElement(By.xpath("(//*[@class='heading'])[1]"));
           WebElement bestbuylogo = driver.findElement(RelativeLocator.with(By.tagName("img")).above(helloheading));
           Assert.assertTrue(bestbuylogo.isDisplayed());


    }

    public void Logotest04 (){
        driver.get("http://www.bestbuy.com");



    }



}
