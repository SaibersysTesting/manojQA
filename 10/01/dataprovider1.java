package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {

	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
	return new Object[][] {{"saimanoj.rompicherla@gmail.com","rompicherla007"},{"rsaimanoj@gmail.com","rompicherla007"}};	
	}

		@Test(dataProvider="Authentication")
	public void login(String sUsername,String sPassword){
			String url="https://www.facebook.com/";
			WebDriver driver =new FirefoxDriver();
			driver.get(url);
			driver.findElement(By.id("email")).sendKeys(sUsername);
			driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.id("loginbutton")).click();
		WebElement element=driver.findElement(By.id("userNavigationLabel"));
		Actions builder=new Actions(driver);
		builder.moveToElement(element).click().build().perform();
		driver.findElement(By.xpath(".//*[@class='uiScrollableAreaContent']/ul/li[16]/a/span[1]")).click();


		}
}


