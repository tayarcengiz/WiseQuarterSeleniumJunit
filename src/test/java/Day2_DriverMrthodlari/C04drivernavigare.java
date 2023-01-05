package Day2_DriverMrthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04drivernavigare {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.choreme.driver","src/drivers/chromedriver.exe")  ;
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        // get ile ayni islevi yapar

        Thread.sleep(3000);
        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);
        // yeniden amazon'a donelim
        driver.navigate().back();

        Thread.sleep(3000);
        // tekrar wisequarter.com'a gitmek istersek
        driver.navigate().forward();


        Thread.sleep(3000);
        driver.quit();
    }


}
