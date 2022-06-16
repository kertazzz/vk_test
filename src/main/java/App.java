import login.login_page;
import user.user_page;
import utilities.utils;

import java.util.Timer;
import java.util.TimerTask;

public class App {
  public static void main(String[] args)  {
    utils.instantiate();
    login_page.clickLogin();
    login_page.setUsername("");
    login_page.confirmUsername();
    login_page.setPassword("");
    login_page.confirmPassword();
    user_page.openMyProfile();
    System.out.println(user_page.getPageName());
    Timer timer = new Timer();
    TimerTask close = new TimerTask() {
      @Override
      public void run() {
        utils.closeDriver();
        timer.cancel();
      }
    };
    timer.schedule(close,15000);

  }
}
