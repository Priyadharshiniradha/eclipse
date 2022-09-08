package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPagebjects {
 public static WebDriver driver;
public LoginPagebjects(WebDriver driver) {

	PageFactory.initElements(driver,this);
	
}
@FindBy(id="txtUsername")
private WebElement username;
@FindBy(id="txtPassword")
private WebElement password;
public WebElement getUsername() {
	return username;
}
public void setUsername(Object un) {
	username.sendKeys((String)un);
}
public WebElement getPassword() {
	return password;
}
public void setPassword(Object pswd) {
	password.sendKeys((String)pswd);
}
public  void launchbrowser()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();	
	//driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
}
}
