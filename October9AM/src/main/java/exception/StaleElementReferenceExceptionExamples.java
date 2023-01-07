package exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionExamples {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\LearnMore\\October9AM\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        try {
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Learn More" + Keys.ENTER);
            searchBox.clear();
        } catch (StaleElementReferenceException e) {
            WebElement search = driver.findElement(By.name("q"));
            search.clear();
        }
    }
}
