package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceLoginByTagName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement userNameField =  driver.findElement(By.tagName("input"));
        WebElement passWordField =  driver.findElement(By.id("password"));
        WebElement loginButton =  driver.findElement(By.id("login-button"));
       userNameField.sendKeys("standard_user");
       passWordField.sendKeys("secret_sauce");
       loginButton.click();
    }
}
