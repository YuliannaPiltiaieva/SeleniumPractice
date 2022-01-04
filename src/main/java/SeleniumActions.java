import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumActions {
    private static long time;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\driver\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);

            WebElement input = driver.findElement(By.id("draggable"));
            WebElement input2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);

            actions.moveToElement(input).clickAndHold().moveToElement(input2).release().build().perform();
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();

        } finally {

            driver.quit();
        }

    }
}
