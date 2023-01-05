package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

       WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        driver.get("https://www.bing.com");
        Thread.sleep(5000);
       // driver.close();


    }
}
