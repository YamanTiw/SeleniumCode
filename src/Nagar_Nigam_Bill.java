import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nagar_Nigam_Bill {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://tax.onlinebnn.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("li16")).click();
	    Select zone = new Select(driver.findElement(By.name("ctl00$MainContent$ddlZone")));
	    zone.selectByVisibleText("Zone-4");
	    driver.findElement(By.name("ctl00$MainContent$txtpinNo")).sendKeys("083793");
	    driver.findElement(By.id("MainContent_btnSerrch")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("MainContent_Grd_img_btn_pay_0")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    System.out.println("Total House Tax = "+driver.findElement(By.name("ctl00$MainContent$lblTotalAmount")).getAttribute("value"));
	   
		System.out.println(driver.findElement(By.id("MainContent_btnOlPay1")).getAttribute("value"));
	//	driver.close();

	}

}
