package selenium_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_without_select {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		//single selection dropdown without select tagname
		driver.get("https://formy-project.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']//a"));
		for(int i=0;i<options.size();i++) {
			String alloptions=options.get(i).getText();
			System.out.println(alloptions);
			Thread.sleep(5000);
			if(options.get(i).getText().equals("Checkbox")) {
				options.get(i).click();
//				options.get(i).getText();
				break;
			}
		}
	}

}
