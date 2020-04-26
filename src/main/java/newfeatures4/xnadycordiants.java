package newfeatures4;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xnadycordiants {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebElement email=driver.findElement(By.id("email"));
		
		WebElement logintton=driver.findElement(By.id("loginbutton"));
		// TODO Auto-generated method stub
		/*
		 * Dimension lgbutton=logintton.getSize(); System.out.println();
		 */
		
		Rectangle rct=logintton.getRect();
		System.out.println(rct.getHeight());
		System.out.println(rct.getWidth());

	}

}
