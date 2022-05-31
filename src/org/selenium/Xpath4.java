package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANOTH\\Documents\\SELENIUM FILES\\SeleniumDay1\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement gettxt = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		String prt = gettxt.getText();
		System.out.println(prt);

		driver.quit();

	}

}
