package Day05_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenilkTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
      //  1- https://www.amazon.com/ sayfasina gidelim
       // 2- arama kutusunu locate edelim
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox") );
       // 3- “Samsung headphones” ile arama yapalim
       // 4- Bulunan sonuc sayisini yazdiralim
       // 5- Ilk urunu tiklayalim
       // 6- Sayfadaki tum basliklari yazdiralim


//1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //2- arama kutusunu locate edelim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones" + Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim
        WebElement sonucYaziElementi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println( sonucYaziElementi.getText());
        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        //6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();
        List<WebElement> basliklarWebElementListesi= driver.findElements(By.xpath("//a[@class ='a-link-normal s-navigation-item']"));
        for (WebElement each: basliklarWebElementListesi
        ) {
            System.out.println(each.getText());
        }
        driver.close();


















    }
}
