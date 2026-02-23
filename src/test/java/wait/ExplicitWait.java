package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userName= explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        WebElement passwordField = explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        WebElement loginButton= explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));

        userName.sendKeys("Admin");
       passwordField.sendKeys("admin123");
        loginButton.click();

    }
}
