package week4.Assignment1;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;


	public class leafDragAndDrop {
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/drag.xhtml");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//drag
			WebElement drag = driver.findElement(By.id("form:conpnl_content"));
			System.out.println( drag.getLocation());
		    Actions builder=new Actions(driver);
		    builder.dragAndDropBy(drag, 213,118).perform();
		   
		    System.out.println(drag.getLocation());
		    //drop
		    WebElement drop = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		    WebElement toDrop = driver.findElement(By.xpath("//p[text()='Drop here']"));
		    Actions builder1=new Actions(driver);
		        builder1.dragAndDrop(drop,toDrop).perform();

				

}
}
