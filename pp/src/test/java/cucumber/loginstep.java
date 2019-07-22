package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginstep {
	

	 public static WebDriver driver;
	 public static WebDriverWait wait;
	 
	 @Given("I want to type the URL")
		public void i_want_to_type_the_URL() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Desktop\\praveen\\driver\\chromedriver.exe");
		     driver = new ChromeDriver();
		     driver.get("http://192.168.40.4:8083/TestMeApp1");
		     driver.manage().window().maximize();
	 }
		     
	
	
	@Then("I click on SignIn button")
	public void i_click_on_SignIn_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@Then("I Enter {string} and {string}")
	public void i_Enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	@Then("I click on Login")
	public void i_click_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}

	@Then("TestMe app Homepage is displayed")
	public void testme_app_Homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.partialLinkText("SignOut"));
	}

}
