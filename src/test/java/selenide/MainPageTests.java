package selenide;

import com.selenide.logic.pages.MainPage;
import org.junit.jupiter.api.Test;

public class MainPageTests extends BaseTestAbs {
  private MainPage mainPage;

  @Test
  public void checkOpenMainPage() {
    mainPage = new MainPage();
    mainPage
        .openPage("/")
        .mainBannerShouldBeHasHeader("Авторские онлайн‑курсы для профессионалов");
  }

  @Test
  public void checkOpenCoursePage() {
    mainPage = new MainPage();
    mainPage
        .openPage("/")
        .getCourseByName("QA")
        .mainBannerShouldBeHasHeader("QA Automation\n" + "Engineer");
  }
}
