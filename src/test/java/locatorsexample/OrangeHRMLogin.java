package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRMLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       WebElement userNameField= driver.findElement(By.name("username"));
       userNameField.sendKeys("Admin");
        WebElement passWordField= driver.findElement(By.name("password"));
        passWordField.sendKeys("admin123");
        WebElement loginButton= driver.findElement(By.tagName("button"));
        loginButton.click();
    }
}
