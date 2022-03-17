package ppack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void login() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.emailAddress().sendKeys("narendra.nese04@gmail.com");
		loginpage.password().sendKeys("Naren@12345");
		loginpage.login().click();
		
		MyAccountPage account=new MyAccountPage(driver);
		Assert.assertTrue(account.account().isDisplayed());;
	}
	
	@AfterMethod
	public void closure(){
		 driver.close();
	}
	
	

}
