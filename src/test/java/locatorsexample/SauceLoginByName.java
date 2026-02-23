package locatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLoginByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
       WebElement userNameField =driver.findElement(By.name("user-name"));
        WebElement passWordField  =driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));

       /* WebElement className =driver.findElement(By.className("error-message-container"));
        WebElement userName = driver.findElement(By.className("input_error form_input"));
        WebElement passWord=driver.findElement(By.className("input_error form_input"));
        WebElement loginButtonField = driver.findElement(By.className("error-message-container"));*/

        userNameField.sendKeys("standard_user");
        passWordField.sendKeys("secret_sauce");
        loginButton.click();
        //className.sendKeys("standard_user");
       // userName.sendKeys("standard_user");
       // passWord.sendKeys("secret_sauce");
       // loginButtonField.click();


    }
}
