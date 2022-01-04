import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSendKeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\driver\\webdriver.chrome.driver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/?hl=ru");

        WebElement input = driver.findElement(By.xpath("//input[@name='q']"));

        input.sendKeys("java", Keys.ENTER);
    }
}
