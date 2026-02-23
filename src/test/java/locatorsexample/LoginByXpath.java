package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginByXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
       WebElement userName= driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input"));
       userName.sendKeys("standard_user");
       WebElement passwordField =driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input"));
       passwordField.sendKeys("secret_sauce");
       WebElement loginButton = driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div/div/form/input"));
       loginButton.click();

    }

}
