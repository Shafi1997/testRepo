package selenium_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle2 {

	public static WebDriver d;
	public static void main(String[] args) {
		d=new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		d.manage().window().maximize();
		
		

	}

}
