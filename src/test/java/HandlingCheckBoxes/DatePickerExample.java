package HandlingCheckBoxes;

import com.sun.source.tree.WhileLoopTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");


      WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
      driver.switchTo().frame(frame);
     WebElement dateInput= driver.findElement(By.id("datepicker"));
     //dateInput.sendKeys("02/01/2026");
     dateInput.click();
      String year = "2026";
      String month ="December";
      String day ="20";
      while(true) {

          String actualMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
          String actualYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
          if (actualMonth.equals(month) && actualYear.equals(year)) {
              break;

          } else {
              WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
              nextButton.click();
          }
      }
          List<WebElement>calenderDays= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
         for (WebElement calenderDay:calenderDays){
             String dayValue= calenderDay.getText();
             if (dayValue.equals(day)){
             calenderDay.click();
             }

         }






    }
}


