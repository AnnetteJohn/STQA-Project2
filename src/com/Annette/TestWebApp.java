package com.Annette;
import java.awt.List;
import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebApp {
    public void loginBrowser() throws InterruptedException {

        //System.setProperty("webdriver.firefox.marionette","/home/annette/gec.exe");
        System.setProperty("webdriver.gecko.driver", "/home/annette/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://sheltered-forest-46226.herokuapp.com/");
        driver.findElement(By.xpath("//*[@id=\"landing-header\"]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys("trial1");
        driver.findElement(By.name("password")).sendKeys("trial1");
        driver.findElement(By.cssSelector("body > form:nth-child(4) > input:nth-child(3)")).click();
        //Thread.sleep(1000);

        driver.findElement(By.cssSelector("div.col-md-3:nth-child(1) > div:nth-child(1) > p:nth-child(3) > a:nth-child(1)"));
        Thread.sleep(100);
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input")).sendKeys("Trial");
        Thread.sleep(100);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input")).sendKeys("600");
        Thread.sleep(100);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[3]/input")).sendKeys("https://www.fabhotels.com/blog/wp-content/uploads/2018/08/Resize_Lonavala-wikipedia.jpg");
        Thread.sleep(100);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/input")).sendKeys("Trial");
        driver.findElement(By.cssSelector(".btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
    }
}
