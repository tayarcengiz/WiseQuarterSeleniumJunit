package Day05_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Google_reklamkapama {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(3000);
        WebElement aramaKutusu = driver.findElement(By.className("gLFyf"));
        driver.findElement(By.className("gLFyf")).click();

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
       // aramaKutusu.clear();
        Thread.sleep(3000);
       driver.close();
       driver.quit();


    }


}
