
import org.openqa.selenium.Keys;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("hello master do you want to use google");
		String option = input.nextLine();
		if (option == "yes" || option == "YES" || option == "Yes") {
			google();
		} else {
			System.out.println("thank you for visiting me");
		}	
	}
	public static void google() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("what do you want to search");
		String search = in.nextLine();
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Launch website
		driver.navigate().to("http://www.google.com/");

		// Click on the search text box and send value

		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}

