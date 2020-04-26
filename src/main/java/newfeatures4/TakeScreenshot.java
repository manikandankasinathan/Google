package newfeatures4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
public static void main(String[] args) 
{
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement email=driver.findElement(By.id("email"));

driver.quit();		
}
 public static void screenshot(WebElement element,String  filename)
 {
 File srcfile=element.getScreenshotAs(OutputType.FILE);
 try {
	FileUtils.copyFile(srcfile, new File("C:/Users/Ashok/Workspace/Maninew/Selenumnewfeatures/screenshots/" + filename +
			".ping"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
