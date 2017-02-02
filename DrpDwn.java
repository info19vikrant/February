package pack;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DrpDwn {
	
	public void fun()
	{
	     WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			java.util.List<WebElement> boxes = driver.findElements(By.tagName("select"));
			for (int i = 0; i < boxes.size(); i++) {
			
				System.out.println(boxes.get(i).getText());
		}}
			public static void main(String[] args) {
		
	        DrpDwn ob=new DrpDwn();
	        ob.fun();
		}

	

}
