package HandlingCheckBoxes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingMouseHover {
    public static void main(String[] args) {
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://thriftmandu-frontend.web.app/");


      WebElement loginButton=  driver.findElement(By.xpath("//span[text()='Log In']"));
      loginButton.click();
     /* WebElement mouseHoverText= driver.findElement(By.xpath("//h2[text()='Mouse Hover']"));
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",mouseHoverText);
      WebElement pointMe=  driver.findElement(By.xpath("//button[text()='Point Me']"));
        Actions act = new Actions(driver);
        act.moveToElement(pointMe).build().perform();*/

    }
}
