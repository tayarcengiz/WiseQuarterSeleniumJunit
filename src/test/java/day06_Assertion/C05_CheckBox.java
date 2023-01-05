package day06_Assertion;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C05_CheckBox extends TestBase {
   // Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
  //  a. Verilen web sayfasına gidin.
  //  https://the-internet.herokuapp.com/checkboxes

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        ReusableMethods.bekle(5);
        WebElement cb1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement cb2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        //	c. Checkbox1 seçili değilse onay kutusunu tıklayın ve secili oldugunu test edin
        if (!cb1.isSelected()){
            cb1.click();
        }

        Assert.assertTrue(cb1.isSelected());

        //	d. Checkbox2 seçili değilse onay kutusunu tıklayın ve secili oldugunu test edin

        if (!cb2.isSelected()){
            cb2.click();
        }

        Assert.assertTrue(cb2.isSelected());

        Thread.sleep(3000);
    }
   // b. Checkbox1 ve checkbox2 elementlerini locate edin.
  //  c. Checkbox1 seçili değilse onay kutusunu tıklayın
   // d. Checkbox2 seçili değilse onay kutusunu tıklayın



   // @After
   // public void setUp(){



}
