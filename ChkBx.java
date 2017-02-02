package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChkBx {
	public void fun(){
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(boxes.size());
	}
		public static void main(String[] args) {
	
        ChkBx ob=new ChkBx();
        ob.fun();
	}

}
