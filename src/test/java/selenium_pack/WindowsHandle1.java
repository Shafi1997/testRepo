package selenium_pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
		Set<String> window=driver.getWindowHandles();
		//convert set to list
		List<String> ids=new ArrayList(window);
		String parent=ids.get(0);
		String child=ids.get(1);
		System.out.println(parent);
		System.out.println(child);
		
		//switch to child
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		//driver.close();
		driver.quit();
	}

}
