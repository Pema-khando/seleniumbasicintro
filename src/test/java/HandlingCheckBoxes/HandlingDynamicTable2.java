package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingDynamicTable2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
      WebElement dynamicText= driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",dynamicText);

      List <WebElement> numberOfRows= driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
        System.out.println("the total row:"+numberOfRows.size());
        List<WebElement> numberOfColumn= driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
        System.out.println("the total column:"+numberOfColumn.size());
        for (int row=1; row<=numberOfRows.size(); row++){
            WebElement columnValue = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr["+row+"]/td[1]"));
            if (columnValue.getText().equals("Chrome")){
                String networkLoad = driver.findElement(By.xpath("//td[text()='Chrome']/following-sibling::td[contains(text(),'Mbps')]")).getText();
                String  netwokSpeed = driver.findElement(By.xpath("//strong[@class='chrome-network']")).getText();
                if (netwokSpeed.contains(networkLoad)){
                    System.out.println("the value of both is same and it is:"+networkLoad);
                }
            }

        }

    }
}
