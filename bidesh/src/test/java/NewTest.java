import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	static WebDriver driver;
	
	public static void getApp(String url) {
        driver.get(url);
        System.out.println(driver.getTitle());
    }
//  @Test
//  public void checkRegister() {
//	  
//	  System.out.println(" ");
//  }
//  @Test
//	public void verifyRegistraion() {
//		driver.get("https://google.com");
//		System.out.println("Testing the registration module");
//		assertEquals(true, false);
//	}
//	
//	@Test
//	public void verifyLogin() {
//		System.out.println("Testing the Login module");
//		assertEquals(false, false);
//	}
	@Test
	public void search() {
        driver.findElement(By.id("APjFqb")).sendKeys("https://ecommerce-bidesh"
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ".vercel.app/");
        driver.findElement(By.id("APjFqb")).submit();
        System.out.println("On the search result page: " + driver.getTitle());
        driver.findElement(By.partialLinkText("Shop With Bidesh")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Signin']")).click();
        
    }
 @Test
    public static void fillForm() throws InterruptedException {
	 
	 driver.findElement(By.id("APjFqb")).sendKeys("https://ecommerce-bidesh"
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ""
	      		+ ".vercel.app/");
     driver.findElement(By.id("APjFqb")).submit();
     System.out.println("On the search result page: " + driver.getTitle());
     driver.findElement(By.partialLinkText("Shop With Bidesh")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[text()='Signin']")).click();
       
        driver.findElement(By.id("firstName")).sendKeys("BIDESH");

     
        driver.findElement(By.id("lastName")).sendKeys("MAL");

        driver.findElement(By.id("email")).sendKeys("bideshmalofficial@gmail.com");

       
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='demo-simple-select']"));
        dropdown.click();
        WebElement admin =driver.findElement(By.xpath("//*[@id=\"menu-role\"]/div[3]/ul/li[1]"));
        admin.click();

        driver.findElement(By.id("password")).sendKeys("password123");

        
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/div/div[6]/button")).click();
        
    }

  @BeforeClass
  public void beforeClass() throws Exception {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
      //getApp("https://google.com");
      driver.get("https://google.com");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test cases are executed successfully");
	  driver.quit();
  }

}
