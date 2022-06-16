package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class utils {
  public static WebDriver driver;

  public static WebDriver instantiate(){
    System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://vk.com/");
    return driver;
  }

  public static void closeDriver()  {
    driver.quit(); }
}
