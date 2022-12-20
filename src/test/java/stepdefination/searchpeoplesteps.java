package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchpeoplesteps {
	WebDriver driver = null;
	@Given("^Browser is open$")
	public void browser_is_open() throws Throwable {
		System.out.println("browser_is_open");
		   String projectPath=System.getProperty("user.dir");
		   System.out.println("project path is"+projectPath);
		   System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
	}

	@And("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   driver.navigate().to("https://www.facebook.com/");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_userid_and_password(String userid, String password) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userid);
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}	
	@And("^user clicks on login$")
	public void user_clicks_on_login()throws Throwable{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	} 


	@And("^user clicks on search page$")
	public void user_clicks_on_search_page() throws Throwable {
	   driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).click();
	}

	@When("^user enter name of the person$")
	public void user_enter_name_of_the_person() throws Throwable {
	    driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Bill Gates");
	}

	@And("^click on search$")
	public void click_on_search() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[2]/div/a/div")).click();
		//driver.quit();
		driver.close();
	}





}
