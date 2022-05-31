package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANOTH\\Documents\\SELENIUM FILES\\SeleniumDay1\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		WebElement gettxt = driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']"));
		String prt = gettxt.getText();
		System.out.println(prt);

		driver.quit();

	}

}
