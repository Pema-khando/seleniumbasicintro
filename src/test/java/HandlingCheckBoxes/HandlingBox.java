package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//label[@class='form-check-label']"));
        for (WebElement checkBox : checkBoxes){
            String dayValue = checkBox.getText();
            if (dayValue.equals("Wednesday")){
                checkBox.click();
            }
            if (dayValue.equals("Thursday")){
                checkBox.click();
            }
           if (dayValue.equals("Monday")){
               checkBox.click();
           }
           if (dayValue.equals("Male")){
               checkBox.click();
           }


        }

    }
}
