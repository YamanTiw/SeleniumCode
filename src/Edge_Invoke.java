import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v100.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edge_Invoke {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.className("search-keyword")).sendKeys("Brocolli");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.linkText("+")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		driver.findElement(By.className("cart-icon")).click();
	
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement srd = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
        Select ctry = new Select(srd);
        ctry.selectByValue("India");
        driver.findElement(By.className("chkAgree")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
        
        
        
		
		driver.close();
		
	}
}