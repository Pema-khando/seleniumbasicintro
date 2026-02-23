package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingFileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
  WebElement uploadFiles= driver.findElement(By.xpath("//h2[text()='Upload Files']"));
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",uploadFiles);
      WebElement singleFileIntputButton=  driver.findElement(By.xpath("//input[@id='singleFileInput']"));
      singleFileIntputButton.sendKeys("C:\\Users\\anils\\.anaconda");
   WebElement singleFileUpload=   driver.findElement(By.xpath("//button[text()='Upload Single File']"));
   singleFileUpload.click();
    }
}
