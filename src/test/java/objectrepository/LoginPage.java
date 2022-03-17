package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement login;
	
	
	public WebElement emailAddress(){
		return emailAddress;
	}
	
	public WebElement password(){
		return password;
	}
	
	public WebElement login(){
		return login;
	}
}
