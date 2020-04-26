package newfeatures4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot2 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement email=driver.findElement(By.id("email"));
		
		TakesScreenshot srcshot=((TakesScreenshot)driver);
		File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:/Users/Ashok/Workspace/Maninew/Selenumnewfeatures/screenshots/email.png"));
		
		driver.quit();
	}

}
