import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

package SeleniumMaster;

public class Testing {

	public static <WebElement> void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samruddhi\\Downloads\\selenium\\chromedriver_win32");
	       WebDriver driver = new ChromeDriver();
		   driver.get("http://seleniummaster.com/sitecontent/seleniummenutest/seleniummenutest.html");
		
		
		
		Actions action = new Actions(webdriver);
		WebElement we = webdriver.findElement(By.xpath("http://seleniummaster.com/sitecontent/seleniummenutest/seleniummenutest.html"));
		action.moveToElement(we).build().perform();
		driver.quit();
		
		
		
					
		
		
	}

}
