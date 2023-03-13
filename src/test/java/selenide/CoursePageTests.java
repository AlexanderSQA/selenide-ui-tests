package selenide;

import com.selenide.logic.pages.CoursePage;
import org.junit.jupiter.api.Test;

public class CoursePageTests {
  CoursePage coursePage;

  @Test
  public void test01() {
    coursePage = new CoursePage();
    coursePage
        .openPage("/lessons/qa-auto-java-specialization/")
        .checkLinkForPay();

  }
}
