package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		//single selection dropdown with select tagname
		WebElement ele=driver.findElement(By.xpath("//select[@id='course']"));
		Select option=new Select(ele);
		option.selectByIndex(3);
		option.selectByValue("java");
		option.selectByVisibleText("Javascript");
}

}
