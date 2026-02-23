package HandlingCheckBoxes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
       WebElement dragDrop =driver.findElement(By.xpath("//h2[text()='Drag and Drop']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()",dragDrop);
       //WebElement dragMe= driver.findElement(By.xpath("//div[@id='draggable']"));
      //WebElement dropHere= driver.findElement(By.xpath("//div[@id='droppable']"));
       WebElement dragMe = driver.findElement(By.id("draggable"));
       WebElement dropHere = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        act.dragAndDrop(dragMe,dropHere).build().perform();
    }
}
