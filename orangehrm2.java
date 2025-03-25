package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class orangehrm2 {
    public static void main(String[] args)throws TimeoutException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        
        driver.findElement(By.partialLinkText("Why OrangeHRM")).click();
        
        WebElement hoverElement = driver.findElement(By.xpath("//a[@class='nav-link-hed'][normalize-space()='Why OrangeHRM']"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverElement).perform();
        
 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='secondary secondary-menu-3']//li[1]"))).click();
              
        WebElement caseStudiesLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Case Studies")));
        caseStudiesLink.sendKeys(Keys.RETURN);
        
       
    }
}
