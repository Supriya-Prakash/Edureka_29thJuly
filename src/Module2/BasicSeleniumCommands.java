package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize / Instantiate / Open Browser
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Supriya\\Supriya\\Selenium Training\\Installation\\Exe Files");
		WebDriver driver = new ChromeDriver();
		
		//Close and Quit
		driver.close();//Close - this will close the current active window of the browser within this instance
		driver.quit();//Quit - this will close all the window open during this instance
		
		//Get commands
		driver.get("https://www.edureka.co");//to open URL of the AUT(application under test)
		driver.getTitle();//to fetch the title of the page and use it for validation
		driver.getCurrentUrl();//to fetch the current URL of the AUT
		
		//navigation commands
		driver.navigate().forward();//move to the next page
		driver.navigate().back();//move to previous page
		driver.navigate().refresh();//page refresh
		
		//Element Handling
		//Click
		driver.findElement(By.id("")).click();
		//TypeCommands
		driver.findElement(By.id("")).sendKeys("");
		//Clear commands
		driver.findElement(By.id("")).clear();

	}

}
