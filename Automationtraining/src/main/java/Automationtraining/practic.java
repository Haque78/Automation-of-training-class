package Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");

driver = new ChromeDriver();	
	driver.navigate().to("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.close();
	}

}

