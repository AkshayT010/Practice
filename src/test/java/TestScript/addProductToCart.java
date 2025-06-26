package TestScript;

import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import genericUtilities.FileUtility;

public class addProductToCart {
	public static void main(String[] args) throws IOException {
		//Read data from property file
		FileUtility futil= new FileUtility();
		String URL = futil.readDataFromPropertyFile("url");
		String USERNAME = futil.readDataFromPropertyFile("username");
		String PASSWORD = futil.readDataFromPropertyFile("password");
		
		//Read data from excel file
		//String PRODUCT_NAME = futil.readDataFromExcelFile("Sheet1", 4, 2);
	//	System.out.println(PRODUCT_NAME);
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
		//Add product to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
//		//Check right product is added in cart or not
//		driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
//		String PRODUCT_ADDED = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
//		System.out.println(PRODUCT_ADDED);
//		
//		if(PRODUCT_ADDED.equals(PRODUCT_NAME))
//		{
//			
//			System.out.println("Right product added");
//		}
//		else 
//		{
//			System.out.println("Wrog product added");
//		}
	}
	
	

}
