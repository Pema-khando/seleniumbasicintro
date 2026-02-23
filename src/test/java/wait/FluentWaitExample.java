package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        FluentWait<WebDriver> fluentObject = new FluentWait<>(driver)
                  .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        WebElement userName = fluentObject.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        userName.sendKeys("Admin");
        WebElement passwordField = fluentObject.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
         passwordField.sendKeys("admin123");
        WebElement loginButton = fluentObject.until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));
          loginButton.click();

        //WebElement userDropDown = fluentObject.until(ExpectedConditions.presenceOfElementLocated(By.tagName("ul[class='oxd-main-menu']")));
       // userDropDown.click();
       // WebElement
    }
}
