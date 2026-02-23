package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingIframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.switchTo().defaultContent();

    WebElement iframeWithInNested=  driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
         iframeWithInNested.click();

        // driver.switchTo().frame("Multiple");
        WebElement firstIframe = driver.findElement(By.xpath("//div[@id='Multiple']/child::iframe"));
        driver.switchTo().frame(firstIframe);

       WebElement  secondIframeContainer = driver.findElement(By.xpath("//div[@class='iframe-container']/child::iframe"));
       driver.switchTo().frame(secondIframeContainer);

      WebElement inputFiled= driver.findElement(By.tagName("input"));
      inputFiled.sendKeys("pema");

      driver.switchTo().defaultContent();
      WebElement singleIframe=driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
      singleIframe.click();
      driver.switchTo().frame("singleframe");
       WebElement inputFiledInside =driver.findElement(By.tagName("input"));
       inputFiledInside.sendKeys("jk");





    }
}
