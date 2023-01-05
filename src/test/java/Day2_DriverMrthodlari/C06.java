package Day2_DriverMrthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chore.driver","src/drivers/chromedriver.exe")  ;
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");


    }
}
