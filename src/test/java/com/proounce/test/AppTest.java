package com.proounce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		        //open application
		driver.get("http://localhost:3000/"); 
		        //login page
		WebElement var=driver.findElement(By.id("username"));
		var.sendKeys("SAEVANS");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("welcome123"); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div/form/label/span[1]/span[1]/input")).click();
		driver.findElement(By.xpath(".//*[@class='MuiButton-label']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@title='AASF']")).click();
    }
}
