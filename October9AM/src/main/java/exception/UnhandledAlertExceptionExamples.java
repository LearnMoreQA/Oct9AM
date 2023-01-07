package exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertExceptionExamples {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\LearnMore\\October9AM\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        try {
            WebElement clickAlert = driver.findElement(By.id("alertButton"));
            clickAlert.click();
            WebElement getText = driver.findElement(By.id("timerAlertButton"));
        } catch (UnhandledAlertException e) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement getText = driver.findElement(By.id("timerAlertButton"));
        }
    }
}
