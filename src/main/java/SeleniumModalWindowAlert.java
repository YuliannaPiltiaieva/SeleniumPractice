import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class SeleniumModalWindowAlert {
    private static long time;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\driver\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 1000);


        try {
            driver.get("http://localhost:63342/myProject/index.html");
            Thread.sleep(5000);

            WebElement element = driver.findElement((By.id("a")));
            WebElement element2 = driver.findElement((By.id("b")));
            WebElement element3 = driver.findElement((By.id("c")));

            element.click();


            Alert alert = wait.until(alertIsPresent());
            alert.accept();

            element2.click();
            Alert prompt = wait.until(alertIsPresent());

            prompt.sendKeys("Super sweet Viktor!!");
            prompt.accept();

            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(5000);
            alert2.accept();

            element3.click();
            Alert alert3 = wait.until(alertIsPresent());
            alert3.dismiss();


        } catch (InterruptedException e){
            e.printStackTrace();

        } finally {

            driver.quit();
        }

    }
}
