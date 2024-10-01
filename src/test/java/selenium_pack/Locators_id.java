package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_id {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		//launch the chrome driver
	    d=new ChromeDriver();
	 //open the url
	    d.get("https://formy-project.herokuapp.com/autocomplete");
	    //maximize the window
	    d.manage().window().maximize();
	    //enter the email in email field
	    d.findElement(By.id("autocomplete")).sendKeys("shafi123@gmail.com");
	    //enter street address
	    d.findElement(By.id("street_number")).sendKeys("safdar nagar");
	    //enter street address 2
	    d.findElement(By.id("route")).sendKeys("Borabanda");
	    //enter city
	    d.findElement(By.id("locality")).sendKeys("Hyderabad");
	    //enter state
	    d.findElement(By.id("administrative_area_level_1")).sendKeys("Telangana");
	    //enter postal or zip code
	    d.findElement(By.id("postal_code")).sendKeys("500018");
	    //enter country name
	    d.findElement(By.id("country")).sendKeys("India");
	    //wait for 2 seconds
	    Thread.sleep(2000);
	    //close the window
	    d.close();
	    
	    
	 

	}

}
