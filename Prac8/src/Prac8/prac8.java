package Prac8;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class prac8 {

static String driverPath="D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\geckodriver\\geckodriver-v0.24.0-win32\\geckodriver.exe";
public static WebDriver driver;
public static void main(String[] args){
	System.setProperty("webdriver.gecto.driver",driverPath);
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/reg/");
	Select se=new Select(driver.findElement(By.xpath("//Select[@id='month']")));
	List <WebElement>mylist=se.getOptions();
	mylist.size();
	System.out.println("Number of items="+mylist.size());
	}
}