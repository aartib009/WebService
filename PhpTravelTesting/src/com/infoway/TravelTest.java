package com.infoway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TravelTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group014\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.org/clientarea.php");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Aarti");
		
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Bhosale");
		
		Thread.sleep(3000);
		driver.findElement(By.id("inputEmail")).sendKeys("aartib009@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.id("inputPhone")).sendKeys("7385811879");
		
		Thread.sleep(3000);
		driver.findElement(By.name("companyname")).sendKeys("Infoway");
		
		Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("Paud,Road");
		
		Thread.sleep(3000);
		driver.findElement(By.name("address2")).sendKeys("Kothrud");
		
		Thread.sleep(3000);
		driver.findElement(By.id("inputCity")).sendKeys("Pune");
		
		Thread.sleep(3000);
		driver.findElement(By.id("stateinput")).sendKeys("Maharashtra");
		
		Thread.sleep(3000);
		driver.findElement(By.name("postcode")).sendKeys("413101");
		
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//*[@id=\"inputCountry\"]"));
		Select drop=new Select(we);
		drop.selectByVisibleText("India");
		
		Thread.sleep(3000);
		driver.findElement(By.id("inputTaxId")).sendKeys("876543");
		
		Thread.sleep(3000);
		WebElement we1=driver.findElement(By.xpath("//*[@id=\"customfield1\"]"));
		Select drop1=new Select(we1);
		drop1.selectByVisibleText("Google");
		
		Thread.sleep(3000);
		driver.findElement(By.name("customfield[2]")).sendKeys("7385811879");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("aarti@123");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password2")).sendKeys("aarti@123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/p/input")).click();
	}

}
