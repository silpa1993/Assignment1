package p1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pclass1 {
	static ChromeDriver driver;
	static String url1="http://qatechhub.com";
	static String url2="https://www.facebook.com";
	
	
	
	
	public static void compare1()
	{
		System.out.print("INSIDE COMPARE1");

		System.setProperty("webdriver.chrome.driver", "C://Users/mssil/OneDrive/Documents/silpa/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url1);
		//maximizing window
		System.out.print("iM HERE 1");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.print("iM HERE");
		//Comparison of title
		String Expected="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		System.out.print("getTitle : "+driver.getTitle());
		if (driver.getTitle().contentEquals(Expected))
				System.out.print("Pass");
		else
			System.out.print("Fail");
	}
	public static void navigateb()
	{
		//navigate to another page
		driver.navigate().to(url2);
		//navigate back
		driver.navigate().back();
		//print url of current page
		System.out.println(driver.getCurrentUrl());
		//navigate forward
		driver.navigate().forward();
		//reload the page
		driver.navigate().refresh();
		//close browser
		driver.close();
	}
	

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		//Pclass1 fun=new Pclass1();
		
		compare1();
		navigateb();
		
		
	}	
	}
