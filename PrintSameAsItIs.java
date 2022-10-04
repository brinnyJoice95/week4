package week4.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintSameAsItIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(" https://html.com/tags/table/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //1. Launch the URL https://html.com/tags/table/
	    	//2. You have to print the respective values based on given Library
	    	//(hint: if the library was absolute usage, then print all its value)
	    //List<String> print = new ArrayList<String>();
	    List<WebElement> print1 = driver.findElements(By.xpath("//table//tr[2]"));
	    for (WebElement string1 : print1) {
			String print11 = string1.getText();
			System.out.println(print11);
	   		
		    		
		    		
		    	}}
}
	 
	    


