import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/progress-bar");
        WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
      WebElement  startButton=driver.findElement(By.xpath("//button[text()='Start']"));
      startButton.click();
      By resetButton = By.id("resetButton");
      WebElement finalOutcome = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(resetButton));
      finalOutcome.click();
    }
}
