package user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.utils;


import java.time.Duration;

public class user_page {
  private final static By MAIN_PAGE = By.cssSelector("#l_pr");

  public static void openMyProfile(){
    WebDriverWait wait = new WebDriverWait(utils.driver, Duration.ofSeconds(10));
    WebElement openPage = wait.until(ExpectedConditions.elementToBeClickable(MAIN_PAGE));
    openPage.click();
  }
  public static String getPageName(){
    WebDriverWait wait = new WebDriverWait(utils.driver, Duration.ofSeconds(10));
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".page_name"))).getText();

  }
}
