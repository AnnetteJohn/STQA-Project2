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

public class TestSelenium {


    public void loginBrowser() throws InterruptedException {

        //System.setProperty("webdriver.firefox.marionette","/home/annette/gec.exe");
        System.setProperty("webdriver.gecko.driver", "/home/annette/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("http://www.gmail.com");

        driver.findElement(By.id("identifierId")).sendKeys("annettejohn31@gmail.com");

        driver.findElement(By.xpath(".//*[@id=\"identifierNext\"]/div/button/div[2]")).click();

        driver.findElement(By.xpath(".//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Leena3172Annette");

        //password next btn

        Thread.sleep(100);
        //compose mail
        driver.findElement(By.xpath(".//*[@id=\":l0\"]/div/div")).click();

        driver.findElement(By.name("to")).sendKeys("annettejohn31@gmail.com");
        Thread.sleep(100);
        driver.findElement(By.name("subjectbox")).sendKeys("Testing");
        driver.findElement(By.id(":r9")).sendKeys("This is an auto-generated mail");
        //*[@id=":pu"]
        driver.findElement(By.className("aoO v7 T-I-atl L3")).click();

        driver.findElement(By.id("gb_71")).click();

//        driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3")).click();
//        driver.findElement(By.name("to")).sendKeys("poojaaj3@gmail.com");
//        Thread.sleep(100);
//
//        driver.findElement(By.name("subjectbox")).sendKeys("Testing");
//        driver.findElement(By.cssSelector(".Am.Al.editable.LW-avf")).sendKeys("This is an auto-generated mail");
//
//        Thread.sleep(100);
//        driver.findElement(By.cssSelector(".T-I.J-J5-Ji.aoO.T-I-atl.L3")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.cssSelector(".J-Ke.n0")).click();
//        Thread.sleep(2000);
//
//
//        driver.findElement(By.cssSelector(".gb_Qc")).click();
//        driver.findElement(By.id("gb36")).click();
//
//
//
//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t"); //switching between tabs
//
////driver.findElement(By.xpath("//*[contains(@title,'Inbox')]")).getText();
//
//        driver.findElement(By.xpath("//div[@aria-label='Select']")).click();//Delete All Check BOX
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@aria-label='Mark as read']")).click();//mark all as read
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@aria-label='Select']")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//div[contains(@id,':2y')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@aria-label='Select']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".T-I.J-J5-Ji.nX.T-I-ax7.T-I-Js-Gs")).click();
//        Thread.sleep(200);
//
//        driver.findElement(By.cssSelector(".T-I.J-J5-Ji.ash.T-I-ax7.L3")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.cssSelector(".gb_b.gb_eb.gb_R")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.cssSelector(".gb_za.gb_6f.gb_cg.gb_Re.gb_Fb")).click();
//
//
// ======================================================================================================
        //UDEMY




    }

}

