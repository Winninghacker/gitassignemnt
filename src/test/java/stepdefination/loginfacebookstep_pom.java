//package stepdefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pages.loginpage;
//
//public class loginfacebookstep_pom {
//	WebDriver driver = null;
//	loginpage login;
//	@Given("^Browser is open$")
//	public void browser_is_open()  {
//		System.out.println("=======I am inside login facebook POM==========");
//		System.out.println("browser_is_open");
//		   String projectPath=System.getProperty("user.dir");
//		   System.out.println("project path is"+projectPath);
//		   System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		   driver = new ChromeDriver();
//		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		   driver.manage().window().maximize();
//	}
//
//	@And("^user is on login page$")
//	public void user_is_on_login_page() throws Throwable {
//	   driver.navigate().to("https://www.facebook.com/");
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_userid_and_password(String userid, String password) throws Throwable {
//		login=new loginpage(driver);
//		login.enterusrname(userid);
//		login.enterpassword(password);
//
//	}
//	
//	@And("^user clicks on login$")
//	public void user_clicks_on_login()throws Throwable{
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
//	} 
//
//	@Then("^user naviagted to the home page$")
//	public void user_naviagted_to_the_home_page() throws Throwable {
//		
//		driver.findElement(By.xpath("//div[@role='button']//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")).click();
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();	
//		driver.close();
//		driver.quit();
//	    
//	}
//
//
//}
