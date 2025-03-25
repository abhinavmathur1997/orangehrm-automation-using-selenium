package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class orangehrm {
	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.orangehrm.com/");
	        driver.findElement(By.linkText("Book a Free Demo")).click();
	        driver.findElement(By.name("FullName")).sendKeys("Abhinav Mathur");
	        driver.findElement(By.name("Contact")).sendKeys("9152106461");
	        driver.findElement(By.name("Email")).sendKeys("abhinavkishore999@gmail.com");
	        driver.findElement(By.name("CompanyName")).sendKeys("IBM");
	        WebElement selectElement = driver.findElement(By.name("Country"));
	        Select select = new Select(selectElement);
	        select.selectByValue("India");
	        WebElement selectElement1=driver.findElement(By.name("NoOfEmployees"));
	        Select select1 = new Select(selectElement1);
	        select1.selectByValue(">1,000");
	     
	      
	        
	}

}
