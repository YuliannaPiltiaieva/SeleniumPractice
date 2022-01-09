import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumWindowsTabs {
    private static long time;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\driver\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 1000);

        JavascriptExecutor js = (JavascriptExecutor)driver;


        try {
            driver.get("http://localhost:63342/myProject/index.html");
            Thread.sleep(5000);

            String window1 = driver.getWindowHandle();

            js.executeScript("window.open()");
            Set<String> currentWindows = driver.getWindowHandles();


            String window2 = null;

            for (String window : currentWindows){
                if (!window.equals(window1)) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            driver.get("https://komnatnie.com/orhid/uhod-orhid/obrezkao");
            Thread.sleep(5000);
            driver.close();

            driver.switchTo().window(window1);

            Thread.sleep(5000);



        } catch (InterruptedException e){
            e.printStackTrace();

        } finally {

            driver.quit();
        }

    }
}
