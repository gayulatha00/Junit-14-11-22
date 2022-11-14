package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j {
	static WebDriver driver;
	@BeforeClass
	public static void Test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
//	@AfterClass
//	public static void Test2() {
//		driver.close();
//		}
	@Before
	public void Test3() {
		long start=System.currentTimeMillis();
		System.out.println(start);
		}
	@After
	public void Test4() {
		long end = System.currentTimeMillis();
		System.out.println("end");
	}
	@Test
	public void Test5() {
		driver.findElement(By.id("email")).sendKeys("greens@123");;
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		

	}
	
	
	
}
