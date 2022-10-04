package week4.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sort {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/sortable");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.switchTo().frame(0);
    WebElement select1  = driver.findElement(By.xpath("//li[text()='Item 1']"));
    WebElement select2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
    WebElement select3  = driver.findElement(By.xpath("//li[text()='Item 3']"));
    
    Actions builder=new Actions(driver);
    Thread.sleep(3000);
    builder.dragAndDrop(select3, select1).perform();
    
    
     String title1 =driver.getTitle();
    System.out.println(title1);
}
}
