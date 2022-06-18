package org.test;

import login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;
import user.UserPage;

public class LoginTest {
  LoginPage testUser;
  @BeforeSuite()
  @Parameters({"emailOrPhone","password"})
  // В Optional - логин, пароль
  public void enterCredentials(@Optional("") String login,@Optional("") String password){
    testUser = new LoginPage().setLoginName(login).setLoginPassword(password);
  }

  @Test()
  public void Login(){
    testUser.openURL().clickLogin().setUsername().confirmUsername().setPassword().confirmPassword();
  }

  @Test(dependsOnMethods = "Login")
  public void verifyLogin(){
    Assert.assertEquals(new UserPage().openMyProfile().getPageName(),"Имя Фамилия");
  }
}
