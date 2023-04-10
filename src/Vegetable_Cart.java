import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vegetable_Cart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> btns = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(btns.size());
		for (int i = 0; i < btns.size(); i++) {
			String Name = btns.get(i).getText();
			System.out.println(btns);
			if (Name.contains("Tomato")) {
				driver.findElement(By.linkText("+")).click();
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}

		}

		driver.findElement(By.className("cart-icon")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement srd = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select ctry = new Select(srd);
		ctry.selectByValue("India");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	}

}
