import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class prac7
{
static String driverPath = "D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\geckodriver\\geckodriver-v0.24.0-win32\\geckodriver.exe";
public static WebDriver driver;
public static void main(String args[]) {
	System.setProperty("webdriver.gecko.driver",driverPath);
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette",true);
	driver= new FirefoxDriver(capabilities);
	driver.get("http://google.com");
	java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total links are"+links.size());
	for (int i = 0; i<links.size(); i=i+1){
		System.out.println("Link "+ i + " Link name "+ links.get(i).getText());
		}
	}
}