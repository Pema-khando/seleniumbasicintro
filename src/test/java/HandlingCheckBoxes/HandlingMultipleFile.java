package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingMultipleFile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement uploadFiles= driver.findElement(By.xpath("//h2[text()='Upload Files']"));
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",uploadFiles);
        WebElement multipleFileUpload = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
        multipleFileUpload.sendKeys(  "C:\\Users\\anils\\OneDrive\\Desktop\\codes\\is.875.3.1987.text" + "\n" +
                        "C:\\Users\\anils\\OneDrive\\Desktop\\codes\\is.456.2000.text");
        WebElement multipleFile = driver.findElement(By.xpath("//button[text()='Upload Multiple Files']"));
        multipleFile.click();
    }
}
