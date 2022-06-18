package user;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;


import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class UserPage {
  private final SelenideElement MAIN_PAGE = $("#l_pr");
  private final SelenideElement USERNAME_LOCATOR = $(".page_name");

  public UserPage openMyProfile(){
    MAIN_PAGE.shouldBe(Condition.visible,Duration.ofSeconds(20)).click();
    return this;
  }
  public String getPageName(){
    return USERNAME_LOCATOR.shouldBe(Condition.appear,Duration.ofSeconds(20)).getText();
  }
}
