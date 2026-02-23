package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/tables/");
        List <WebElement> tableData=driver.findElements(By.xpath("//figure[@class='wp-block-table']/table/tbody/tr/td"));
        for (WebElement tData: tableData){
            String tableDataClick= tData.getText();
            System.out.println(tableDataClick);
        }
        List <WebElement> tableData1= driver.findElements(By.xpath(""));
    }
}
