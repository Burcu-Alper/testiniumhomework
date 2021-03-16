

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;

public class otomasyonSenaryosu {



    @Test
    public void webSitesiAcma() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\burcu\\IdeaProjects\\webotomasyon\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        System.out.println("driver sürücüsü:Chromeda Browser oluşturma");
        driver.manage().window().maximize();
        System.out.println("browser ekran boyuttunu ayarlama");
        driver.manage().deleteAllCookies();
        driver.get("https://www.gittigidiyor.com/");
        System.out.println("web sitesine giriş");



        driver.findElement(By.name("k")).sendKeys("Bilgisayar");
        System.out.println("Arama kutucuğuna bilgisayar kelimesi girilir");

        driver.findElement((By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button"))).click();
        System.out.println("Bul butonu tıklanır.");
        driver.findElement(By.xpath(".//*[@class='pager pt30 hidden-m gg-d-24']/a[2]")).click();


        System.out.println("debug");


    }
    }