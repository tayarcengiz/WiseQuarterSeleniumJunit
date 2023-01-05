package Day2_DriverMrthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_windowhandl {
    public static void main(String[] args) throws InterruptedException {


   System.setProperty("webdriver.chore.driver","src/drivers/chromedriver.exe")  ;
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        System.out.println(driver.getWindowHandle()); // CDwindow-C98BA9BE4C20B7A6CF86FE120B09A887


        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());



        Thread.sleep(3000);
        driver.quit();
    }


}
