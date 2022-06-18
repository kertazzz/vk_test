package login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
  private final SelenideElement  ENTER_TO_LOGIN = $("button.FlatButton.FlatButton--primary.FlatButton");
  private final SelenideElement LOGIN_INPUT = $(".vkc__TextField__input");
  private final SelenideElement LOGIN_BUTTON = $(".vkc__Button__container.vkc__Button__primary.vkc__Button__fluid");
  private final SelenideElement PASSWORD_INPUT = $("[name=\"password\"]");
  private final SelenideElement PASSWORD_BUTTON = $(".vkc__Button__container.vkc__Button__primary.vkc__Button__fluid");

  private String username;

  private String password;

  public LoginPage setLoginName(String username){
    this.username = username;
    return this;
  }
  public LoginPage setLoginPassword(String password){
    this.password = password;
    return this;
  }
  public LoginPage openURL(){
    open("https://vk.com");
    return this;
  }
  public LoginPage clickLogin() {
    ENTER_TO_LOGIN.shouldBe(Condition.interactable,Duration.ofSeconds(20)).click();
    return this;
  }
  public LoginPage setUsername(){
    LOGIN_INPUT.shouldHave(Condition.visible,Duration.ofSeconds(20)).sendKeys(this.username);
    return this;
  }
  public LoginPage confirmUsername(){
    LOGIN_BUTTON.shouldBe(Condition.interactable, Duration.ofSeconds(20)).click();
    return this;
  }
  public LoginPage setPassword(){
    PASSWORD_INPUT.shouldHave(Condition.visible,Duration.ofSeconds(20)).sendKeys(this.password);
    return this;
  }
  public void confirmPassword(){
    PASSWORD_BUTTON.shouldBe(Condition.interactable,Duration.ofSeconds(20)).click();

  }




}
