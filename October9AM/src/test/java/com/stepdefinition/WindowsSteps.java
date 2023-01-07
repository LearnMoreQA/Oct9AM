package com.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import resuseable.BrowerInvoke;

import java.util.List;
import java.util.Set;

public class WindowsSteps extends BrowerInvoke {

    WebDriver driver;
    @When("User Count Products Link")
    public void countLinks(){
        WebElement product = driver.findElement(By.xpath("//p[text()='Products']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,1000)");
        js.executeScript("arguments[0].scrollIntoView();",product);

       List<WebElement> links = product.findElements(By.xpath("following-sibling::ul/li/a"));

        System.out.println("Total Link Count : "+ links.size());

        for (WebElement link:links) {
           link.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER)); // Shortcut Key
        }

        Set<String> windowValues =  driver.getWindowHandles();

        for (String windowName:windowValues) {
            System.out.println("Window Name : "+windowName);
          String title = driver.switchTo().window(windowName).getTitle();
           if(title.contains("Visual")){
               driver.switchTo().window(title);
               break;
           }
            System.out.println(title);
        }
        driver.switchTo().defaultContent();
    }

    @And("Click Each Link to handle Windows")
    public void click_each_link_to_handle_windows() {

    }

    @Given("User Navigates to Browser Url")
    public void userNavigatesToBrowserUrl() {
        driver = BrowerInvoke.openBrowser();
    }
}
