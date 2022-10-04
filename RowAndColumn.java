package week4.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowAndColumn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 List<WebElement> col = driver.findElements(By.xpath("//table//th"));
		    System.out.println("count of column :" +col.size());
		    List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		    System.out.println("count of Row :" +row.size());
		    String progress = driver.findElement(By.xpath("//table//tr[3]//td[2]")).getText();
		    System.out.println("Progress Value:"+progress);
		    driver.findElement(By.xpath("//table//tr[4]//td[3]")).click();
		    
		

	}

}
