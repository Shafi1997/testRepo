package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", doubleclick);
		
		Actions act=new Actions(driver);
		
		act.doubleClick(doubleclick).perform();
		WebElement rhtclick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rhtclick).perform();
		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
		//act.click(click).perform();
		act.moveToElement(click).click().perform();

	}

}
