package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_locators {

	public static WebDriver d;

	public static void main(String[] args) {

		// launch the chromedriver
		d = new ChromeDriver();
		// open the url
		d.get("https://adactinhotelapp.com/");
		//maximize the window screen
		d.manage().window().maximize();
		// click the link new user register herer
		d.findElement(By.linkText("New User Register Here")).click();
		// navigate back
		d.navigate().back();
		// click the new user register here link again
		d.findElement(By.partialLinkText("New User")).click();
		// navigate back
		d.navigate().back();
		// click the new user register here link again using text function
		d.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		// navigate back
		d.navigate().back();
		// click the new user register here link again using contains text function
		d.findElement(By.xpath("//a[contains(text(),'New User Register Here')]")).click();
		// navigate back
		d.navigate().back();
		// click the new user register here link again using contains attribute function
		d.findElement(By.xpath("//a[contains(@href,'Register.php')]")).click();
		// enter username
		d.findElement(By.id("username")).sendKeys("abcd1234");
		//clear text
		d.findElement(By.id("username")).clear();
		// enter username using name
		d.findElement(By.name("username")).sendKeys("xyzabc1234");
		// enter username using classname //input[starts-with(@class,'reg_')]
		d.findElement(By.className("reg_input")).sendKeys("abc1234");
		// enter username using xpath attribute //input[@type='text'] or from near by
		// tag //form[@method='post']/table/tbody/tr[2]/td[2]/input[1]
		d.findElement(By.xpath("//form[@method='post']/table/tbody/tr[2]/td[2]/input[1]")).sendKeys("xyzabc1234");
		// enter password
		d.findElement(By.id("password")).sendKeys("asdf1234");
		// enter password using name
		d.findElement(By.name("password")).sendKeys("jkhlk1234");
		// enter password using classname //input[starts-with(@class,'reg_')]
		d.findElement(By.className("reg_input")).sendKeys("fdasd1234");
		// enter password using xpath attribute //input[@type='password'] or from near
		// by tag //form[@method='post']/table/tbody/tr[3]/td[2]/input[1]
		d.findElement(By.xpath("//form[@method='post']/table/tbody/tr[3]/td[2]/input[1]"));
		// enter confirm password
		d.findElement(By.id("re_password")).sendKeys("asdf1234");
		// enter confirm password using name
		d.findElement(By.name("re_password")).sendKeys("jkhlk1234");
		// enter fullname using id
		d.findElement(By.id("full_name")).sendKeys("Mohammed");
		// enter fullname using name
		d.findElement(By.name("full_name")).sendKeys("Shafi");
		// enter fullname using xpath
		// //form[@method='post']/table/tbody/tr[5]/td[2]/input[1] from near by tag
		d.findElement(By.xpath("//form[@method='post']/table/tbody/tr[5]/td[2]/input[1]")).sendKeys("Mohd Shafi");
		// enter email address using id
		d.findElement(By.id("email_add")).sendKeys("abc@gmail.com");
		// enter email address using name
		d.findElement(By.name("email_add")).sendKeys("1234@gmail.com");
		// enter fullname using xpath
		// //form[@method='post']/table/tbody/tr[6]/td[2]/input[1] from near by tag
		d.findElement(By.xpath("//form[@method='post']/table/tbody/tr[6]/td[2]/input[1]"))
				.sendKeys("abc1234@gmail.com");
		// click captcha image refresh icon
		d.findElement(By.xpath("//img[@alt='Refresh Captcha']")).click();
		d.findElement(By.xpath("//img[@src='img/refresh.png']")).click();

	}

}
