

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

        driver.get("https://www.gittigidiyor.com/uye-girisi");
        System.out.println("web sitesine giriş");

        driver.findElement(id("L-UserNameField")).sendKeys("deneme12345test@hotmail.com");
        driver.findElement(id("L-PasswordField")).sendKeys("Parola123_123");
driver.findElement(cssSelector("#gg-login-enter")).click();

        driver.findElement(name("k")).sendKeys("Bilgisayar");
        System.out.println("Arama kutucuğuna bilgisayar kelimesi girilir");

        driver.findElement((xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button"))).click();
        System.out.println("Bul butonu tıklanır.");

        driver.findElement(cssSelector("#product_id_607730685 > a")).click();
        System.out.println("ürünlerden rastgele bir ürün seçilir.");

        driver.findElement(cssSelector("#buyitnow_adet")).clear();
        driver.findElement(cssSelector("#buyitnow_adet")).sendKeys("1");
        driver.findElement(By.id("sp-addbasket-button")).click();
        System.out.println("Seçilen ürün sepete eklenir");

        driver.findElement(By.cssSelector("#header_wrapper > div.header-icon-container.robot-header-iconContainer.gg-w-5.gg-d-6.gg-t-14.gg-m-11.gg-w-push-14.gg-d-push-12.gg-t-push-0.gg-m-push-0 > div.basket-container.robot-header-iconContainer-cart > a")).click();
        System.out.println("Sepet butonuna tıklanır.");

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.className("btn-delete")).click();
        System.out.println("Ürün sepetten silinir.");

    }
    }