package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchpeople {
	WebDriver driver;
	By txt_userid=By.xpath("//input[@id='email']");
	By txt_password=By.xpath("//input[@id='pass']");
	By btn_login=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");
	By txt_search=By.xpath("//input[@placeholder='Search Facebook']");
	By btn_search=By.xpath("//strong[normalize-space()='bill gates']");
	//By btn_logout=By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span");
	public searchpeople(WebDriver driver) {
		this.driver=driver;
	}
	public void enterusrname(String userid) {
		driver.findElement(txt_userid).sendKeys(userid);
		
	}
	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	//public void checklogoutisdisplayes() {
//		driver.findElement(btn_logout).click();
	//}
	public void Searchpeople() {
		driver.findElement(txt_search).sendKeys("Bill Gates");
		
	}
	public void clicksearch() {
		driver.findElement(btn_search).click();
	}
	public void loginvaliduser(String userid,String password) {
		driver.findElement(txt_userid).sendKeys(userid);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.findElement(btn_search).click();

	}
	}
