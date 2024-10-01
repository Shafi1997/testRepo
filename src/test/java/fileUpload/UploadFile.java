package fileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//upload file by sendkeys
		//driver.findElement(By.className("upload_txt")).sendKeys("C:\\Users\\ADMIN\\Desktop\\LoginData.xlsx");
		//upload file using robot class
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.className("upload_txt"));
		act.moveToElement(ele).click().perform();//local window will open
		Thread.sleep(5000);
		Robot rb=new Robot();
		//goto folder and select file, copy the file, paste file
		//to copy Url of file into the system
		StringSelection ss=new StringSelection("C:\\Users\\pc\\Desktop\\shafi.txt");//select file from folder
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//copy the file
		//press ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);//press ctrl key
		rb.keyPress(KeyEvent.VK_V);//press v key
		//release
		rb.keyRelease(KeyEvent.VK_V);//release v key
		rb.keyRelease(KeyEvent.VK_CONTROL);//release ctrl key
		//press enter
		rb.keyPress(KeyEvent.VK_ENTER);
		//relase enter
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
//		driver.quit();
	}

}
