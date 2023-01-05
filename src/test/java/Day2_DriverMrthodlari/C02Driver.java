package Day2_DriverMrthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02Driver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(" maximaize boyt"+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        driver.close();
    }
}
