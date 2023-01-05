package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

// amazonda nutella aramasi yapin en yuksek fiyati bulun
public class C02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        List<WebElement> fiyatlarListesi= driver.findElements(By.className("a-price-whole")) ;
        System.out.println(fiyatlarListesi);
        for ( WebElement each :fiyatlarListesi
        ){
            System.out.print(each.getText()+" ");
        }



        Thread.sleep(3000);
        driver.close();
    }

}
