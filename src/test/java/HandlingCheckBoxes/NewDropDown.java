package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class NewDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement userField = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        userField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        loginButton.click();
        WebElement  pimButton= driver.findElement(By.xpath("//span[text()='PIM']"));
        pimButton.click();
        WebElement employeeInf= driver.findElement(By.xpath("//button[@type='button']"));
        employeeInf.click();
        WebElement jobButton = driver.findElement(By.xpath("//label[text()='Job Title']/ancestor::div[contains(@class,'oxd-input-group')]//div[contains(@class,'oxd-select-text')]"));
       jobButton.click();
     WebElement dropDown = driver.findElement(By.xpath("//span[text()='Chief Financial Officer']"));
          dropDown.click();

          WebElement employeeStatus = driver.findElement(By.xpath("//label[text()='Employment Status']/ancestor::div[contains(@class,'oxd-input-group')]//div[contains(@class,'oxd-select-text')]"));
          employeeStatus.click();
       WebElement statusButton=   driver.findElement(By.xpath("//span[text()='Full-Time Contract']"));
       statusButton.click();

    }
}
