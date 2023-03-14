package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import java.util.Locale;


public class BaseTestAbs {


  @BeforeAll
  public static void setUp() {
    Configuration.baseUrl = System.getProperty("base_url").trim().toLowerCase(Locale.ROOT);
    Configuration.browser = System.getProperty("browser").trim().toLowerCase(Locale.ROOT);
    Configuration.browserSize = "1920x1080";
    Configuration.headless = true;
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
  }

  @AfterEach
  public void close() {
    Selenide.closeWebDriver();
  }
}
