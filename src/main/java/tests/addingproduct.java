package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class addingproduct {
	WebDriver driver;
public static void main(String[] args) {
	
	addingproduct a = new addingproduct();
	a.openBrowser();
	a.login();
	a.product();
}

public void openBrowser() {
	driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
}
public void login() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
public void product() {
	driver.findElement(By.xpath("//input[@id = 'SearchProductName']")).sendKeys("Apple MacBook Pro 13-inch");
	new Select(driver.findElement(By.xpath("//select[@id = 'SearchCategoryId']"))).selectByValue("3");
	new Select(driver.findElement(By.xpath("//select[@id = 'SearchManufacturerId']"))).selectByValue("1");
	new Select(driver.findElement(By.xpath("//select[@id ='SearchVendorId']"))).selectByValue("0");
	new Select(driver.findElement(By.xpath("//select[@id = 'SearchWarehouseId']"))).selectByValue("0");
	new Select(driver.findElement(By.xpath("//select[@id ='SearchProductTypeId']"))).selectByValue("5");
	new Select(driver.findElement(By.xpath("//select[@id ='SearchPublishedId']"))).selectByValue("1");
	driver.findElement(By.xpath("//input[@id ='GoDirectlyToSku']")).sendKeys("1800");
	
	driver.findElement(By.xpath("//button[@id ='search-products']")).click();
	
	
}
}
