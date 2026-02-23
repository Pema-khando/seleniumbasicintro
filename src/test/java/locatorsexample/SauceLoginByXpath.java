package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceLoginByXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@placeholder='username']"));
        userName.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.xpath("//*[contains(@id,'password')]"));
           passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }
}
