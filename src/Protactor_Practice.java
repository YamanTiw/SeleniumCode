import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Protactor_Practice {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement button = driver.findElement(By.cssSelector("input[innerText='Type to Select Countries']"));
		button.click();
		button.sendKeys("India");
		
		
	}

}
