package DERSHARICIpracktik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSelenium2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        System.out.println(driver.manage().window().getSize());// pixel(1052, 671)
        System.out.println(driver.manage().window().getPosition());// 9*9


    }
}
