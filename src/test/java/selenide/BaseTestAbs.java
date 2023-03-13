package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.util.Locale;


public class BaseTestAbs {


  @BeforeEach
  public void setUp() {
    Configuration.baseUrl = System.getProperty("base_url").trim().toLowerCase(Locale.ROOT);
    Configuration.browser = System.getProperty("browser").trim().toLowerCase(Locale.ROOT);
    Configuration.browserSize = "1920x1080";
    Configuration.headless = true;
  }

  @AfterEach
  public void close() {
    Selenide.closeWebDriver();
  }
}
