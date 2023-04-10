import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

//	    driver.findElement(By.linkText("Multiple Windows")).click();
//	    driver.findElement(By.linkText("Click Here")).click();
//	    
//	    Set<String> windows = driver.getWindowHandles();
//	    Iterator<String> it = windows.iterator();
//	    String parent = it.next();
//	    String child = it.next();
//	    driver.switchTo().window(child);
//	    System.out.println(driver.findElement(By.className("example")).getText());
//	    
//	    driver.switchTo().window(parent);
//	    
//	    System.out.println(driver.findElement(By.xpath("//div/div/h3")).getText());

		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame((driver.findElement(By.cssSelector("frame[src='/frame_top']"))));
		driver.switchTo().frame((driver.findElement(By.cssSelector("frame[src='/frame_middle']"))));
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		

	}

}
