package Day13_ExelWrite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C06_JavascriptExecute extends TestBase {

        @Test
        public void test(){
            // amazona gidip
            driver.get("https://www.amazon.com");

            //sell linkine JS Executor kullanarak click yapin
            WebElement selllinki= driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_sell']"));

            JavascriptExecutor jse=(JavascriptExecutor) driver;

            jse.executeScript("arguments[0].click();",selllinki);
            //jse.executeScript("arguments[0].scrollIntoView();",hedefWebelement);
            //olusturulan hedef web elemente kadar sayfayi asagiya kaydirir.

            jse.executeScript("alert('Bu is bu kadar')");
            ReusableMethods.bekle(3);




        }

}
