package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDSingleMul {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d=new ChromeDriver();
		//single selection dropdown without select tagname
		d.get("https://letcode.in/dropdowns");
		d.manage().window().maximize();
		WebElement ele=d.findElement(By.id("fruits"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		s.selectByValue("2");
		s.selectByVisibleText("Pine Apple");
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("******************************************");
		WebElement ele1=d.findElement(By.id("superheros"));
		Select s1=new Select(ele1);
		s1.selectByIndex(3);
		s1.selectByValue("ca");
		s1.selectByVisibleText("Superman");
		s1.deselectAll();
		s1.selectByIndex(3);
		s1.selectByValue("ca");
		s1.selectByVisibleText("Superman");
		s1.deselectByVisibleText("Superman");
		for (int i = 0; i <=s1.getOptions().size(); i++) {

			System.out.println(s1.getAllSelectedOptions().get(i).getText());
		}
		

	}

}
