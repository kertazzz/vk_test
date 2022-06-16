package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.utils;

import java.time.Duration;

public class login_page {
  private static final By ENTER_TO_LOGIN = By.cssSelector("button.FlatButton.FlatButton--primary.FlatButton");
  private static final By LOGIN_INPUT = By.cssSelector(".vkc__TextField__input");
  private static final By LOGIN_BUTTON = By.cssSelector(".vkc__Button__container.vkc__Button__primary.vkc__Button__fluid");
  private static final By PASSWORD_INPUT = By.cssSelector("[name=\"password\"]");
  private static final By PASSWORD_BUTTON = By.cssSelector(".vkc__Button__container.vkc__Button__primary.vkc__Button__fluid");

  public static void clickLogin() {
    WebDriverWait wait = new WebDriverWait(utils.driver, Duration.ofSeconds(10));
    WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(ENTER_TO_LOGIN));
    loginButton.click();
  }
  public static void setUsername(String username){
    WebDriverWait wait = new WebDriverWait(utils.driver, Duration.ofSeconds(10));
    WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(LOGIN_INPUT));
    userName.sendKeys(username);
  }
  public static void confirmUsername(){
    WebDriverWait wait = new WebDriverWait(utils.driver, Duration.ofSeconds(10));
    WebElement sendUsername = wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON));
    sendUsername.click();
  }
  public static void setPassword(String password){
    WebDriverWait wait = new WebDriverWait(utils.driver, Duration.ofSeconds(10));
    WebElement userPassword = wait.until(ExpectedConditions.elementToBeClickable(PASSWORD_INPUT));
    userPassword.sendKeys(password);
  }
  public static void confirmPassword(){
    WebDriverWait wait = new WebDriverWait(utils.driver, Duration.ofSeconds(10));
    WebElement sendPassword = wait.until(ExpectedConditions.elementToBeClickable(PASSWORD_BUTTON));
    sendPassword.click();
  }




}
