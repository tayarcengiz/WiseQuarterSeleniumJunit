package DERSHARICIpracktik;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        // 1.   driver.get("https://www.techlistic.com/p/selenium-practice-form.html")     sitesine gidiniz.
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //     2. cerezlerden kurtul
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
       //3.   fill the firstname     fill the lastname      check the gender      check the experience      fill the date
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali Sami");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("TAYAR");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        WebElement genderRadioButton = driver.findElement(By.id("sex-0"));
        genderRadioButton.click();
        genderRadioButton.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("2023.12.14");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        driver.findElement(By.id("continents")).sendKeys("Europa" + Keys.ENTER);
       // driver.findElement(By.xpath("(//select[@class='input-xlarge'])[1]")).sendKeys("Europe"+ Keys.ENTER);
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        driver.findElement(By.id("submit")).click();






        Thread.sleep(3000);
        driver.close();
        /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html

    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Europa
    choose your command  -> Browser Commands
    click submit button
 */
/*
        driver.findElement(By.xpath("//div[text()='Alle ablehnen']")).click();
        driver.findElement(By.id("ez-accept-all")).click();
        driver.findElement(By.id("cookieChoiceDismiss")).click();
        driver.findElement(By.name("firstname")).sendKeys("Hikmet"+ Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akyol" + Keys.ENTER);
        WebElement genderRadioButton = driver.findElement(By.id("sex-0"));
        genderRadioButton.click();
        genderRadioButton.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("24.12.2022"+Keys.ENTER);

        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).sendKeys("Europa" + Keys.ENTER);
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        driver.findElement(By.id("submit")).click();


*/


     /*   driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("Efe");
        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).sendKeys("Torun");
        driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"exp-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"continents\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
        driver.close();
        */





    }
}
