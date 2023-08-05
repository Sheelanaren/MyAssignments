package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrame {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
    driver.manage().window().maximize();
    //driver.switchTo().frame(0);
    //driver.findElement(By.xpath("//button[@id='Click']")).click();
    //System.out.println("Hurray! You Clicked Me.");
    driver.switchTo().frame(2);
    driver.switchTo().frame("frame2");
    driver.findElement(By.id("Click")).click();
    System.out.println("Hurray! You Clicked Me.");
    
   
   
  

	}

}
