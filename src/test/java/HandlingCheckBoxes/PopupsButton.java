package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PopupsButton {
    WebDriver driver = new ChromeDriver();
    public void setUp(){

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/popups/");
        WebElement  popUps= driver.findElement(By.xpath("//h1[text()='Popups']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",popUps);

    }
    public void alertPopups(){
        setUp();
      WebElement alertPopupsButton=  driver.findElement(By.xpath("//button[@id='alert']"));
      alertPopupsButton.click();
      //driver.switchTo().alert().accept();
    //  driver.switchTo().alert().dismiss();

    }
    public void confirmPopups(){
        setUp();
     WebElement confirmPopupsButton=  driver.findElement(By.xpath("//button[@id='confirm']"));
     confirmPopupsButton.click();
     //driver.switchTo().alert().accept();
     //driver.switchTo().alert().dismiss();

    }
  public void promptPopupsButton(){
      setUp();
     WebElement promptPopupsButton= driver.findElement(By.xpath("//button[@id='prompt']"));
     promptPopupsButton.click();
     driver.switchTo().alert().sendKeys("hello");
     driver.switchTo().alert().accept();
     //driver.switchTo().alert().dismiss();

    }

    public static void main(String[] args) {
        PopupsButton pb = new PopupsButton();
        //pb.alertPopups();
       // pb.confirmPopups();
        pb.promptPopupsButton();


    }
}
