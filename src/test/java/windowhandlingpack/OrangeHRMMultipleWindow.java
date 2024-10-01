package windowhandlingpack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMMultipleWindow {

	public static WebDriver driver;
	public static void main(String[] args) throws
	InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
	
	Set<String> window=driver.getWindowHandles();
	List<String> ids=new ArrayList(window);
	String parent=ids.get(0);
	String child=ids.get(1);
	System.out.println(parent);
	System.out.println(child);
	
//	driver.switchTo().window(child);
	
//	int NoofIframe=driver.findElements(By.tagName("//iframe")).size();
//	System.out.println(NoofIframe);
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,3000)","");
//	js.executeScript("arguments[0].scrollIntoView();",frameIcon);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight");
//	js.executeScript(“window.scrollBy(0,document.body.scrollHeight”);
//	driver.switchTo().frame(0);
	WebElement frameIcon=driver.findElement(By.xpath("(//a[@href='/en/orangehrm-starter-open-source-software/'])[3]"));

	
//	WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RM8JTkWmDxc?si=bxm6p8YaeP9Y_jr8&enablejsapi=1&origin=https://www.orangehrm.com']"));
//	driver.switchTo().frame(iframe);
//	Actions a=new Actions(driver);
//	a.moveToElement(frameIcon).click().perform();
//	a.click(frameIcon).perform();
	frameIcon.click();
	
	
	
	
	/*int NoofIframe=driver.findElements(By.tagName("//iframe")).size();
	System.out.println(NoofIframe);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight");
	js.executeScript("arguments[0].scrollIntoView();",orangeHrmLink);
	js.executeScript("window.scrollBy(0,3000)","");
	WebElement frameIcon=driver.findElement(By.xpath("//a[@class='ytp-title-channel-logo']"));
//	driver.switchTo().frame(0);
	WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RM8JTkWmDxc?si=bxm6p8YaeP9Y_jr8&enablejsapi=1&origin=https://www.orangehrm.com']"));
//	WebElement iframe=driver.findElement(By.tagName("//iframe"));
	driver.switchTo().frame(iframe);
	
	orangeHrmLink.click();*/
	
	}

}
