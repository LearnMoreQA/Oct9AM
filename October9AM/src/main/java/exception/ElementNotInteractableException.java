package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotInteractableException {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\LearnMore\\October9AM\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\selenium training\\HiddenField.html");

        WebElement textBox = driver.findElement(By.id("textId"));
        textBox.sendKeys("Learn More");
    }
}
