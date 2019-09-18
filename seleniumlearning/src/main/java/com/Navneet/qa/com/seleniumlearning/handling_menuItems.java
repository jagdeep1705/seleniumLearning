package com.Navneet.qa.com.seleniumlearning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_menuItems {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//click accept/dismiss unhandledalerts with WebDriver
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.DISMISS);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		driver.get("https://www.firstcry.com/");
		//Thread.sleep(3000L);
		//WebDriverWait(driver).until(ExpectedConditions.alertIsPresent());
		
		Set<String> winids=driver.getWindowHandles();
		System.out.println(winids.size());
		Iterator<String> iterate=winids.iterator();
		System.out.println(iterate.next());
		System.out.println("After the main window the popup window id is");
		winids=driver.getWindowHandles();
		iterate=winids.iterator();
		while(iterate.hasNext())
		{
			String popupwindow=iterate.next();
			
			System.out.println(popupwindow);
		}
		
		((JavascriptExecutor) driver).executeScript("closelogin()");
		Thread.sleep(3000L);
		
		
	    
		//String firstwindow=iterate.next();
		
		//System.out.println(firstwindow);
		
		
		/*Alert alert=driver.switchTo().alert();
		Thread.sleep(3000L);
		System.out.println(alert.getText());
		alert.dismiss();
		//div[@class='welcome_mainsection']*/
		WebElement mainmenu=driver.findElement(By.xpath("//div[@class='menu-container media-pros']/ul/li[4]/a"));
		System.out.println("mousehover on mainmenu");
		//WebElement submenu=driver.findElement(By.linkText("Sports & Games"));
		WebElement submenu=driver.findElement(By.xpath("//a[contains(text(),'Sports & Games')][1]"));
		System.out.println("found submenu");
		Actions actions=new Actions(driver);
		actions.moveToElement(mainmenu).perform();
		Thread.sleep(3000L);
		submenu.click();
		
		Thread.sleep(3000L);
		//driver.findElement(By.xpath("//div[@class='menu-container media-pros']/ul/li[2]/a")).click();
		driver.quit();

	}

}
