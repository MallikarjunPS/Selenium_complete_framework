package testScripts;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class landingPage
{
    public  static WebDriver driver;
    public static void main(String[] args) {

           System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

         driver = new ChromeDriver();
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

                    clickclosePopup();
                    clickCheckOut();

}



public  static void clickCheckOut() {



                WebDriverWait wait = new WebDriverWait(driver, 40);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"body-component\"]/div/main/div[2]/div[1]/div[2]/div/div[3]")));// instead of id u can use cssSelector or xpath of ur element.

             try {

                    driver.findElement(By.xpath("//*[@id=\"body-component\"]/div/main/div[2]/div[1]/div[2]/div/div[3]")).click();

                }

             catch (Exception e) {

                    clickCheckOut();
                }

            }

    public  static void clickclosePopup() {


                    WebDriverWait wait = new WebDriverWait(driver, 40);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"body-component\"]/div/main/div[2]/div[1]/div[2]/div/div[2]/div[2]/img")));// instead of id u can use cssSelector or xpath of ur element.
            try {

                    driver.findElement(By.xpath("//*[@id=\"body-component\"]/div/main/div[2]/div[1]/div[2]/div/div[2]/div[2]/img")).click();

                }

            catch (Exception e) {
            clickclosePopup();
        }

    }
}