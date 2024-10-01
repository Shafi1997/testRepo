package selenium_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDDwithselect {
	
	
	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		d=new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement e=d.findElement(By.xpath("//select"));
		Select s=new Select(e);
		s.selectByIndex(3);//Algeria
		s.selectByValue("ATA");
		s.selectByVisibleText("Canada");
//		System.out.println(s.getAllSelectedOptions());
		//print all the option present in select tag
//		String l=e.getText();
//		System.out.println(l);  


		List<WebElement> l=s.getOptions();
		for (int i = 0; i < l.size(); i++) {
			
			System.out.println(l.get(i).getText());
			if(l.get(i).getText().equals("Cuba"))
			{
				l.get(i).click();
				Thread.sleep(2000);
				break;
			}
			
		}
		
		
		System.out.println(s.getFirstSelectedOption().getText());
//		System.out.println(s.getOptions());

	}

}
