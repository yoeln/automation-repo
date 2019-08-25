package il.co.google.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		
		driver.get("http://google.com");
		
		WebElement serchBox=driver.findElement(By.name("q"));
		serchBox.sendKeys("ynet\n");
		
		WebElement appclick=driver.findElement(By.className("gb_z"));
		appclick.click();

	}

}
