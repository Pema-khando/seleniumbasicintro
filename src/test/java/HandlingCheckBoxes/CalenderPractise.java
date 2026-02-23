package HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CalenderPractise {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/calendars/");
        WebElement  calenderField = driver.findElement(By.xpath("//input[@type='text'and @name='g1065-1-selectorenteradate']"));
        calenderField.click();
        String year = "2030";
        String month ="December";
        String day ="31";




        WebElement dropDown = driver.findElement(By.xpath("(//header[@class='dp-cal-header']//button[@type='button'])[1]"));
        dropDown.click();
           WebElement calenderDecember= driver.findElement(By.xpath("//button[@data-month='11']"));
                 calenderDecember.click();
       WebElement calenderYear = driver.findElement(By.xpath("(//header[@class='dp-cal-header']//button[@type='button'])[2]"));
         calenderYear.click();

        WebElement nextMonth=driver.findElement(By.xpath("//button[@data-year='2030']"));
        nextMonth.click();
        WebElement calenderDay = driver.findElement(By.xpath("//button[text()='31']"));
        calenderDay.click();



    }

}
