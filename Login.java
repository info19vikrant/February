package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Login extends Driver {
		public void case1() {
		String err1;
		err1 = "Please enter a valid email address.";
		System.out.println("Executint test case 1- Invalid Email");
		System.out.println("Expected result= Please enter a valid email address.");
		drive.get("http://accounts.google.com");
		drive.manage().window().maximize();
		drive.findElement(By.id("Email")).sendKeys("jdsghkj,fjshkfv");
		drive.findElement(By.id("next")).click();
		//try {
			//Thread.sleep(5000);
		//} catch (InterruptedException e) {
			//e.printStackTrace();
		//}
		java.util.List<WebElement> links = drive.findElements(By.id("errormsg_0_Email"));
		for (int i = 0; i < links.size(); i++) {
			System.out.print("Actuall result= ");
			System.out.println(links.get(i).getText());
			if ((links.get(i).getText()).equals(err1)) {
				System.out.println("Test Case passed");
			} else
				System.out.println("Test case failed");
		}

	}

	public void case2() {
		String err2;
		err2 = "Wrong password. Try again.";
		System.out.println("Executint test case 2- Valid Email but Invalid Password");
		System.out.println("Expected result= Wrong password. Try again.");
		drive.get("http://accounts.google.com");
		drive.manage().window().maximize();
		drive.findElement(By.id("Email")).sendKeys("info19vikrant");
		drive.findElement(By.id("next")).click();
		WebDriverWait wait=new WebDriverWait(drive, 10);
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		drive.findElement(By.id("Passwd")).sendKeys("djgfhjr");
		drive.findElement(By.id("signIn")).click();
		java.util.List<WebElement> links = drive.findElements(By.id("errormsg_0_Passwd"));
		for (int i = 0; i < links.size(); i++) {
			System.out.print("Actuall result= ");
			System.out.println(links.get(i).getText());
			if ((links.get(i).getText()).equals(err2)) {
				System.out.println("Test Case passed");
			} else
				System.out.println("Test case failed");
		}
	}

	public static void main(String[] args) {
		Login ob = new Login();

		ob.case1();

		ob.case2();

	}
}