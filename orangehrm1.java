package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class orangehrm1 {
public static void main(String[] args)
{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.orangehrm.com/");
      WebElement selectElement = driver.findElement(By.name("locale"));
      Select select = new Select(selectElement);
      select.selectByValue("/es");
     
      
}
}
