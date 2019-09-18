package com.Navneet.qa.com.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		driver.get("http://www.espncricinfo.com/");
		
		//((JavascriptExecutor) driver).executeScript("");
		driver.quit();
		

	}

}
