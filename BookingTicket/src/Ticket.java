import org.openqa.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ticket {

	public static void main(String[] args) {
		// DO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samruddhi\\Downloads\\selenium\\chromedriver_win32");
       WebDriver driver = new ChromeDriver();
	   driver.get("https://www.redbus.in/");
	   
	   WebElement from = driver.findElement(By.id("src"));
	   from.sendKeys("Mumbai");
	   
	   WebElement to = driver.findElement(By.id("dest"));
	   to.sendKeys("Goa");
	   
	   String ExpMonth = "Sepetember 2020";
	   
	   String CurrentMonthm = driver.findElement(By.cssSelector("div.depart.span.current")).getText(); 
	   
	   if (ExpMonth.equals(CurrentMonth)) {
		   System.out.println("Month is already selected");
	   }
	   else {
		   for(int i=1 ; i<12 ; i++) {
		+	   driver.findElement(By.cssSelector("div.depart button[class*='next']")).clicl();
		       Thread.sleep(1000);
		       CurrentMonthm = driver.findElement(By.cssSelector("div.depart.span.current")).getText(); 
			   if (ExpMonth.equals(CurrentMonth)) {
		   System.out.println("month selected");
		   break;
			   }
		   }
	   }
	   
	    Thread.sleep(1000);
	    WebElement datepicker = driver.findElement(By.cssSelector("div.depart div.container-body table tbody"));
	    List<WebElement> dates = datepicker.findElement(By.ByTagName("td"));
	    
	    for(WebElement date : dates) {
	    	
	    	String calDate = date.getAttribute("date-id");
	    	if(calDate.equals("15-sep-2020")) {
	    		
	    		date.click();
	    		break;
	    	}
	    	
	    }
	    
	    
	   WebElement SearchBuses = driver.findElement(By.id("search_btn"));
	   SearchBuses.click();
	   
	   driver.quit();
	   
	}

}
