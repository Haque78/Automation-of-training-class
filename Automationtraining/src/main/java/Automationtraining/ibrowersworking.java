package Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ibrowersworking {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
driver =new ChromeDriver();
driver.navigate().to("http://www.amazon.com");
driver.manage().window().maximize();
Thread.sleep(4000);
driver.navigate().refresh();
Thread.sleep(9000);
driver.navigate().back();
Thread.sleep(8000);
driver.navigate().forward();
Thread.sleep(4000);
 String windowhandle  =driver.getWindowHandle();
	System.out.println(windowhandle);
	String urlofbrowser=driver.getCurrentUrl();
	System.out.println(urlofbrowser);
	driver.close();
	
	
	
	
	
	
	
	}

}


