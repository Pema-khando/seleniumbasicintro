package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleAlert {
    WebDriver driver = new ChromeDriver();
    public void  setUp(){

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
     //   WebElement tabsText=driver.findElement(By.xpath("//h2[text()='Tabs']"));
      // JavascriptExecutor jse =  (JavascriptExecutor) driver;
      //  jse.executeScript("arguments[0].scrollIntoViews()",tabsText);
    }
    public void simpleAlert(){
        setUp();
      WebElement simpleAlert=driver.findElement(By.xpath("//button[text()='Simple Alert']"));
      simpleAlert.click();
      //driver.switchTo().alert().accept();
      //driver.switchTo().alert().dismiss();
    }
    public void conformationAlert(){
        setUp();
     WebElement conformationAlertButton=   driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
      conformationAlertButton.click();
      driver.switchTo().alert().accept();
     // driver.switchTo().alert().dismiss();
    }
    public  void  promptAlert(){
        setUp();
      WebElement promptAlertButton=  driver.findElement(By.xpath("//button[text( )='Prompt Alert']"));
      promptAlertButton.click();
      driver.switchTo().alert().sendKeys("pem");
      driver.switchTo().alert().accept();
    }

    public static void main(String[] args) {
        HandleAlert hd = new HandleAlert();
        //hd.simpleAlert();
       // hd.conformationAlert();
        hd.promptAlert();
    }
}
