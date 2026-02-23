import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class FormField {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://surabhitrading.com/contact-us");
        WebElement nameField = driver.findElement(By.name("name"));
        nameField.sendKeys("bts");
        WebElement emailField = driver.findElement(By.xpath("//input[@type='email' and  @class='form-control ']"));
        emailField.sendKeys("hello123@gmail");
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone_number']"));
        phoneNumber.sendKeys("1263434");
        WebElement message= driver.findElement(By.xpath("//textarea[@name='message']"));
        message.sendKeys("hello my friend");
        WebElement sendButton = driver.findElement(By.xpath("//button[text()='Send']"));
        sendButton.click();


    }

      /*  List<WebElement> favoriteDrinkCheckBox = driver.findElements(By.xpath("//input[@name='fav_drink']"));
       for (WebElement clickingCheckBox: favoriteDrinkCheckBox){
           clickingCheckBox.click();
       }

       WebElement radioButton = driver.findElement(By.id("color1"));
       radioButton.click();

       WebElement  mouseHover = driver.findElement(By.xpath("//label[text()='Do you like automation?']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",mouseHover);
        WebElement downButtonEle = driver.findElement(By.xpath("//select[@id='automation']"));
        Select downButton =new Select(downButtonEle);
        //select option by dropdown
        downButton.selectByVisibleText("Yes");
     WebElement emailField=   driver.findElement(By.id("email"));
     emailField.sendKeys("hello123@gmail.com");
     WebElement
    }messageField = driver.findElement(By.xpath("//textarea[@id='message']"));
     messageField.sendKeys("hello how are you");
     WebElement button = driver.findElement(By.xpath("//button[@id='submit-btn']"));
     button.click();
     driver.quit();*/
}
