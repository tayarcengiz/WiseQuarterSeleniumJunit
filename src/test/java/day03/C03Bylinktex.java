package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03Bylinktex {
    public static void main(String[] args) throws InterruptedException {
        //amazona git gift cards linkini tikla  gift card sayfasina gittiginizi onaylayin.
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        // WebElement giftCardLinki= driver.findElement(By.linkText("Gift Cards"));

        Thread.sleep(4000);
        WebElement giftCardLinki=driver.findElement(By.partialLinkText("Gift Cards"));
        giftCardLinki.click();

        // istenen sayfaya gittigini test etmek icin
        // titkle'in Gift Card icerdigini test edebiliriz

        String expectedKelime="Gift Cards";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Card testi FAILED");
        }


        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
