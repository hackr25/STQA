import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	
	public static void main(String []args){
		int a=10 , b= 20;
		System.out.println("Hii.....");
		System.out.println(a+b);
		System.out.println("Selenium Demo");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	

}
