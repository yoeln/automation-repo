import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Progrem {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoeln\\workplace2\\yoeln2\\github-automation\\git\\yoel\\chromewebdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/login");
	
	WebElement searchBox1=driver.findElement(By.name("login"));
	searchBox1.sendKeys("yoeln");
	
	WebElement searchBox2=driver.findElement(By.name("password"));
	searchBox2.sendKeys("Giveme123456789");
	
	WebElement button=driver.findElement(By.name("commit"));
	button.click();
	
	
	
	
	
	
	
	

	}

}
