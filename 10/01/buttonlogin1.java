package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class buttonlogin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com/");
		driver.findElement(By.cssSelector("#button-login")).click();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rsaimanoj");
		driver.findElement(By.cssSelector("#password")).sendKeys("saimanoj");
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
