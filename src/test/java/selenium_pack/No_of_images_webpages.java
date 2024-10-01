package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_images_webpages {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		//launch the chrome browser
		d=new ChromeDriver();
		//open the url
		d.get("https://practice.automationtesting.in/shop/");
		//number of images on webpage
		int images=d.findElements(By.tagName("img")).size();
		//print the how many number of images are on this web page
		System.out.println(images);
		//close the window
		d.close();
		

	}

}
