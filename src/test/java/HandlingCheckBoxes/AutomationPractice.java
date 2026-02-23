package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutomationPractice {
    WebDriver driver = new ChromeDriver();
    public void setUp(){

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/iframes/");
        WebElement iframeButton = driver.findElement(By.xpath("//a[text()='Iframes']"));
         JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("arguments[0].scrollIntoViews()",iframeButton);
    }
   public  void  iframeButtonApi(){
       setUp();
       driver.switchTo().frame("iframe-1");

       WebElement iframeAPI = driver.findElement(By.xpath("//a[text()='API']"));
      iframeAPI.click();
      //driver.switchTo().frame("iframe-1");

    }
    public static void main(String[] args) {
        AutomationPractice ap = new AutomationPractice();

        ap.iframeButtonApi();
    }

}
