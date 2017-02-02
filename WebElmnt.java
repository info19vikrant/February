package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElmnt {
	WebDriver driver;
	WebElement username,password;
	public void check()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		username=driver.findElement(By.id("email"));
		if(username.isDisplayed())
		{
			System.out.println("Username is displayed");
		}
		else
			System.out.println("Username is not displayed");
	}

	public static void main(String[] args) {
		WebElmnt ob=new WebElmnt();
		ob.check();

	}

}
