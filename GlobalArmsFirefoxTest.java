import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalArmsFirefoxTest{

    public static void main(String args[]) throws Exception
    {
	    WebDriver driver;	
	
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		driver=new FirefoxDriver();				
		driver.get("http://hydlanarms01:84/");
		//Browser Maximize
        driver.manage().window().maximize();
		        //Login
		        driver.findElement(By.id("UserName")).sendKeys("user1test");
		        driver.findElement(By.id("Password")).sendKeys("Suth@9999");
          driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();  
          Thread.sleep(3000);
        //Logout
        driver.findElement(By.xpath("//strong[text()='Logout']")).click();
        driver.close();
             
		
	}
}

