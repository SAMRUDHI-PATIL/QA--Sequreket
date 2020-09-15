


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


package SeleniumMaster;

public class WaitandGo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samruddhi\\Downloads\\selenium\\chromedriver_win32");
	       WebDriver driver = new ChromeDriver();
	        //explicit wait
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get(" http://seleniummaster.com/sitecontent/seleniummenutest/seleniummenutest.htm");
	       driver.findElement(By.linkText("Go Back to the Main Page")).click();
	       driver.findElement(By.ByXPat());
	       
	       driver.quit();

	}

}
