package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysdifferent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		StringBuilder username=new StringBuilder()
		.append("mani")
		.append(" ")
		.append("surya")
		.append(" ")
		.append("nathan");
		email.sendKeys(username);
		String space=" ";
		
		StringBuffer userinfo=new StringBuffer()
				.append("suji")
				.append(" ")
				.append("kandan");
		String Authorname="manikandan";
		
		email.sendKeys(username,space,userinfo,space,Authorname,Keys.TAB);
		
	}
	


}
