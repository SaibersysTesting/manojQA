package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserinvocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "\\C:\\Program Files (x86)\\IEDriverServer");
		WebDriver	driver	=new	EdgeDriver();
	}

}
