package testScripts;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class landingPage
{
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://drinkfinity-dev.mybigcommerce.com");

        driver.manage().window().maximize();


        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id='menu']/nav/ul/li[3]/a/span[2]"));
        action.moveToElement(we).build().perform();

        driver.findElement(By.xpath("//*[@id='navPages-shop']/ul/li[3]/a/span/span")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='product-listing-container']/div/div/div[2]/form/ul/li[12]/article/div[1]/figure/a/div/img")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//section[@class='productView-details']//img[2]")).click();

                    /*String Parent = driver.getWindowHandle();
                    Set<String> allwh = driver.getWindowHandles();
                    for (String wh:allwh)
                    {
                    driver.switchTo().window(wh);

                    }*/

        driver.findElement(By.xpath("//img[@class='cart-preview-close pull-right']")).click();
    }

        }