package com.ffm.ts4u;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLogin {
	
     static	String baseurl = "http://104.248.53.138/";

     static WebDriver driver;

	 public static void main(String[] args) throws InterruptedException {
		
	//Setup the browser
     WebDriverManager.firefoxdriver().setup();
     //declaring the browser
	 driver = new FirefoxDriver();
		//maximize browser
     driver.manage().window().maximize();	
		//get the Url 
     driver.get(baseurl);
			
	 Thread.sleep(4000);
	//giving username
     driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("rupak9865@gmail.com");
    //giving password
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("rupak9865");
	 
	 Thread.sleep(2000);
	//click on login
	 driver.findElement(By.xpath("/html/body/div/div/div/div/form/input[3]")).click();
	 
	 Thread.sleep(4000);
	 //click on username
	 driver.findElement(By.xpath("//*[@id=\"dropdown-basic-button\"]")).click();
	
	 Thread.sleep(2000);
	//click on logout
	 driver.findElement(By.xpath("/html/body/div/body/div/div[2]/div[1]/div[2]/div/div/div/a[2]")).click();

	 Thread.sleep(4000);
	//quit driver
	 driver.quit();
				
	}

}
