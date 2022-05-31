package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANOTH\\Documents\\SELENIUM FILES\\SeleniumDay1\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement txt1 = driver.findElement(By.xpath("(//span[@class='text'])[3]"));
		txt1.click();

		// String over = txt1.getText();
		// System.out.println(over);

		WebElement txt2 = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		String prt2 = txt2.getAttribute("Value");
		System.out.println(prt2);
		driver.quit();
	}

}
