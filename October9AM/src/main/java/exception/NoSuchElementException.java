package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\LearnMore\\October9AM\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Learn More" + Keys.ENTER);
    }
}
