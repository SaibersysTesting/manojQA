package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("rsaimanoj@gmail.com");
		//driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("09k910483");
		driver.findElement(By.name("pass")).sendKeys("rompicherla007");
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
	}

}
