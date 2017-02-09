package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
public	static WebDriver drive;
	Driver()
	{
		 
		drive=new FirefoxDriver();
		//drive.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		

	}
}
