package org.cts.sd;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\windowhan\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com");
	WebElement srch = driver.findElement(By.xpath("//input[@id=\"inputValEnter\"]"));
	srch.sendKeys("fasttrack watches");
	WebElement btn = driver.findElement(By.xpath("//button[@class=\"searchformButton col-xs-4 rippleGrey\"]"));
	btn.click();
	String pid = driver.getWindowHandle();
	System.out.println(pid);
	WebElement clk = driver.findElement(By.xpath("(//img[@class=\"product-image \"])[2]"));
	clk.click();
	Set<String> cid = driver.getWindowHandles();
	System.out.println(cid);
	for (String x : cid) {
		if(!pid.equals(x))
		{
			driver.switchTo().window(x);
		}
	}
	WebElement kart = driver.findElement(By.xpath("//div[@class=\"col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink\"]"));
		kart.click();
	WebElement crt = driver.findElement(By.xpath("//div[@class=\"cartInner\"]"));
	crt.click();
	Thread.sleep(2000);
	WebElement ad = driver.findElement(By.xpath("//div[@id=\"CS1\"]"));
	ad.click();
	WebElement to = driver.findElement(By.xpath("(//li[@class=\"undefined\"])[1]"));
	to.click();
	}



}
