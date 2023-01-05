package Day2_DriverMrthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03Drive {
    public static void main(String[] args) {
      System.setProperty("webdriver.chore.driver","src/drivers/chromedriver.exe")  ;
      WebDriver driver =new ChromeDriver();
      driver.get("http=//www.amazon.com");
      String pageSource=driver.getPageSource();



    }
}
