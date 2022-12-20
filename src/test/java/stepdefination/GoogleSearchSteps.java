package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver = null;
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
	   System.out.println("browser_is_open");
	   String projectPath=System.getProperty("user.dir");
	   System.out.println("project path is"+projectPath);
	   System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	}

	@And("^user is on google search page$")
	public void user_is_on_google_search_page() throws Throwable {
	   System.out.println("user_is_on_google_search_page");
	   driver.navigate().to("https://google.com");
	}

	@When("^user enter text in search box$")
	public void user_enter_text_in_search_box() throws Throwable {
	System.out.println("user_enter_text_in_search_box");
	driver.findElement(By.xpath("//input[@title='Search']")).click();
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("arun sharma");}
	
	
	@And("^hits enter$")
	public void hits_enter() throws Throwable {
	   System.out.println("hits_enter");
	   //driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user is navigated to search page$")
	public void user_is_navigated_to_search_page() throws Throwable {
	  System.out.println("user_is_navigated_to_search_page");
	  driver.getPageSource().contains("IIM Bangalore");
	  driver.close();
	  driver.quit();
	}


}
