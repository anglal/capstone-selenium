package com.aazaa.selejenkins;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class SeleniumHeadLessMain {

	public static void main(String[] args) throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  
	  ChromeOptions chromeOptions = new ChromeOptions(); 
	  chromeOptions.addArguments("--headless");
	  
	  WebDriver driver = new ChromeDriver(chromeOptions);
	  
	  System.out.println("Scripted Executing");
	  

		// Navigate to "test server"
		driver.get("http://3.16.89.122:8085/contact.html");
		System.out.println("Navigated to test server contact");
		
		
		//Wait 3 seconds
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		// Enter Name
		driver.findElement(By.id("inputName")).sendKeys("Lal");
		System.out.println("Entered name");
		Thread.sleep(1000);
		
		// Enter Number
		driver.findElement(By.id("inputNumber")).sendKeys("1234567890");
		System.out.println("Entered Number");
		Thread.sleep(1000);
		
		// Enter Email
		driver.findElement(By.id("inputMail")).sendKeys("lal@mail.com");
		System.out.println("Entered Email");
		Thread.sleep(1000);
		
		
		// Enter Message
		driver.findElement(By.id("inputMessage")).sendKeys("This is Lal");
		System.out.println("Entered Message");
		Thread.sleep(1000);
		
		// Click submit
		driver.findElement(By.id("my-button")).click();
		System.out.println("Submitted");
		Thread.sleep(1000);
		
	  
	  System.out.println("Scripted executed successfully");
	 

	}

}
