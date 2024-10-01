package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingMouseActions {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//scroll By pixel
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
		
		//scroll by element location
		WebElement ele=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//scroll to bottom of webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		ele.sendKeys("vamshi");

	}

}
