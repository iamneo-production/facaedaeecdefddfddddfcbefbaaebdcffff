package com.examly.springapp;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import java.util.List;


public class SpringApplicationTests {

	public static void main(String[] args) {
		try{
			
		ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://34.85.242.216:4444"), chromeOptions);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("http://www.flipkart.com");
			List<WebElement> Link=driver.findElements(By.tagName("a"));
			System.out.println(Link.size());
			String url=driver.findElement(By.linkText("Amazon Pay")).getAttribute("href");
			System.out.println(url);
		}catch (MalformedURLException e) {
            e.printStackTrace();
        }
	}

}