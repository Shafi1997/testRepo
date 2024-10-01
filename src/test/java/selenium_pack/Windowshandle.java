package selenium_pack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//String parentid=driver.getWindowHandle();
		//System.out.println(parentid);
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
		Set<String> window=driver.getWindowHandles();
		//to get IDs from set using Iterator
		Iterator<String> ids=window.iterator();
		String parent=ids.next();
		String child=ids.next();
		//String child2=ids.next();
		//String child3=ids.next();
		System.out.println(parent);
		System.out.println(child);
		
		//switch to child
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		//switch to parent
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();

	}

}
