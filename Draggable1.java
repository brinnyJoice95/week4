package week4.Assignment1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Draggable1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath(""))
		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println( drag.getLocation());
	    Actions builder=new Actions(driver);
	    builder.dragAndDropBy(drag, 10,11).perform();
	   
	    System.out.println(drag.getLocation());
			}

}
