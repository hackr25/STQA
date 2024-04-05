import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class prac9{
static String driverPath="D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\geckodriver\\geckodriver-v0.24.0-win32\\geckodriver.exe";
public static WebDriver driver;
public static void main(String[] args){
	System.setProperty("webdriver.gecto.driver",driverPath);
	WebDriver driver=new FirefoxDriver();
	driver.get("D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\p9.html");
	int radiochk=0,checkboxchk=0;
	int radiounchk=0,checkboxunchk=0;
	List<WebElement>els=driver.findElements(By.xpath("//input[@type='radio']"));
	for(WebElement el:els){
		if(el.isSelected()){
			radiochk++;
			}
		else{
			radiounchk++;
			}
		}
	System.out.println("Radio Buttons");
	System.out.println("Total Checked items"+ radiochk);
	System.out.println("Total unChecked items"+ radiounchk);
	List<WebElement>ebox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement el:ebox){
		if(el.isSelected()){
			checkboxchk++;
			}
		else{
			checkboxunchk++;
			}
		}
	System.out.println("Checkboxes");
	System.out.println("Total Checked items"+ checkboxchk);
	System.out.println("Total unChecked items"+ checkboxunchk);
	}
}