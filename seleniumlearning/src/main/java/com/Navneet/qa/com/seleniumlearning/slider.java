package com.Navneet.qa.com.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/slider/");
		
		WebElement demoframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(demoframe);
		//Thread.sleep(3000L);
		
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		Actions action=new Actions(driver);
		Thread.sleep(3000L);
		action.dragAndDropBy(slider, 90, 0).perform();
		Thread.sleep(3000L);
		driver.quit();
	}

}
