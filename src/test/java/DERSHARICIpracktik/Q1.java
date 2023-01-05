package DERSHARICIpracktik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        driver.get("https://www.bing.com");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().to("https://www.wisequarter.com");

        Thread.sleep(1000);
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
            //(");
       // driver.get("https=//www.google.com/");
       // driver.findElement(By.id("L2AGLb")).click();

       // driver.navigate().back();

       // String pageSource=driver.getPageSource();


        System.out.println("All okey");

        driver.quit();


    }
}
