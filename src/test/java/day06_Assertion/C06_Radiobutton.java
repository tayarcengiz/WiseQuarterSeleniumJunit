package day06_Assertion;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C06_Radiobutton extends TestBase {
    @Test
    public void test001() throws InterruptedException {
        //	a. Verilen web sayfasına gidin.
        //	     https://facebook.com
        driver.get("https://facebook.com");
        //	b. Cookies’i kabul edin
        // driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
        driver.findElement(By.xpath("//button[text()='Sadece temel çerezlere izin ver']")).click();
        ReusableMethods.bekle(15);
        //	c. Create an account buton’una basin
       // driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //	d. Radio button elementlerini locate edin ve size uygun olani secin
        driver.findElement(By.xpath("//*[@class='_8esa']")).click();

        Thread.sleep(4000);
    }
}
