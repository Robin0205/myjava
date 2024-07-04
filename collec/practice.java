package collec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Robin\\eclipse-workspace\\Hello world\\Resources\\chromedriver.exe"); // webdriver.gecko.driver
																					// //webdriver.ede.driver
		WebDriver driver = new ChromeDriver(); // creating object at interface level
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.close();
		

	}

}
