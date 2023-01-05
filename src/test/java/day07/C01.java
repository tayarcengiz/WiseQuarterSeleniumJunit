package day07;

import org.junit.Test;
import utilities.TestBase;

public class C01 extends TestBase {
    @Test
    public void test01() {

        // amazon'a gidin
        driver.get("https://www.amazon.com");
        driver.getWindowHandle();
        String ilkSayfaWHD= driver.getWindowHandle();
        System.out.println(ilkSayfaWHD);//    CDwindow-0F485180563F2BEDF5C47F6E6C058E58
        //   CDwindow-E4650B20220609D95B5783A68AF87A01


    }
}