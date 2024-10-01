package windowhandlingpack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {
	public static WebDriver driver;
	public static void main(String[] args) throws
	InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	//String parentid=driver.getWindowHandle();
	//System.out.println(parentid);
//	driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
	//click "Open New Seperate Windows" option
	driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
	//click "click" button
	driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
	Set<String> window=driver.getWindowHandles();
	//to get IDs from set using Iterator
//	Iterator<String> ids=window.iterator();
	List<String> ids=new ArrayList(window);
//	String parent=ids.next();
//	String child=ids.next();
	String parent=ids.get(0);
	String child1=ids.get(1);
	String child2=ids.get(2);
	//String child2=ids.next();
	//String child3=ids.next();
	System.out.println(parent);
	System.out.println(child1);
	System.out.println(child2);
	//switch to child
//	driver.switchTo().window(child1);
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//span[text()='Downloads']")).click();
//	//switch to parent
//	driver.switchTo().window(parent);
//	Thread.sleep(5000);
////	//click "Open New Seperate Windows" option
//	driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
//	//click "click" button
//	driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
	driver.switchTo().window(child1);
//	WebElement downloads=driver.findElement(By.xpath("//a[@href='/downloads']"));
	Actions a=new Actions(driver);
//	a.moveToElement(downloads).keyDown(Keys.CONTROL).

	Thread.sleep(5000);
	WebElement youtube=driver.findElement(By.xpath("//a[@href='https://www.youtube.com/channel/UCbDlgX_613xNMrDqCe3QNEw']"));
	Thread.sleep(5000);
	a.moveToElement(youtube).click().perform();
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight");
//	js.executeScript("window.scrollBy(0,900)","");
//	js.executeScript("arguments[0].scrollIntoView();",youtube);
	
//	driver.findElement(By.xpath("//ul[@class='list-inline mb-0']/li[3]/a/i[@class='fab fa-youtube']")).click();
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shafi");
	
//	Set<String> window1=driver.getWindowHandles();
//	//to get IDs from set using Iterator
//	Iterator<String> ids1=window1.iterator();
//	String parent1=ids1.next();
//	String child1=ids1.next();
//	System.out.println(parent1);
//	System.out.println(child1);
////	driver.switchTo().window(child1);
	
	
	}


}
