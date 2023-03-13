package selenide;

import com.selenide.logic.pages.CoursePage;
import org.junit.jupiter.api.Test;

public class CoursePageTests extends BaseTestAbs {
  CoursePage coursePage;

  @Test
  public void checkRedirectButton() {
    coursePage = new CoursePage();
    coursePage
        .openPage("/lessons/qa-auto-java-specialization/")
        .useRedirectByLink()
        .checkButtonToSubmitApp();
  }
}
