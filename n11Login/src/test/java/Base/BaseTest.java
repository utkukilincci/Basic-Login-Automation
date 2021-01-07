package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
   public static WebDriver driver;

   @Before
   public void setUp(){
      System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.n11.com/");
   }

   /*
   @After
   public void tearDown(){
      driver.quit();
   }
   */

   public static WebDriver getDriver() {
      return driver;
   }

   public static void setDriver(WebDriver driver) {
      BaseTest.driver = driver;
   }

}
