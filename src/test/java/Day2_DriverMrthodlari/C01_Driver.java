package Day2_DriverMrthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        //Acilan sayfanin basliginin amazon icerdigini test et.
        String expectedkelime= "amazon";
        String actualResult= driver.getTitle();
        if ( actualResult.contains(expectedkelime)){
            System.out.println("Title testi Passed");
        }else  {
            System.out.println(("Title testi Faild"));
            System.out.println(driver.getTitle());
        }
        // giitigimiz sayfayi dogrulayin
        String excpectedurl =("https://www.amazon.com");
       //String actuelurl=driver.
        if ( actualResult.contains(expectedkelime)){
            System.out.println("Title testi Passed");
        }else  {
            System.out.println(("Title testi Faild"));
            System.out.println(driver.getTitle());
        }


        Thread.sleep(5000);
        driver.close();
    }

}
