package com.selenide.logic.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;


public class CoursePage extends BasePage<CoursePage> {

  private SelenideElement getLinkForPay() {
    return $x("//div/u/a[contains(text(), '')]");
  }

  private SelenideElement getRedirectButtonToSubmitApp() {
    return $x("//div[@id='rec330678621']//div/a[contains(text(), '')]");
  }

  public CoursePage useRedirectByLink() {
    getLinkForPay()
        .shouldBe(Condition.visible)
        .scrollTo()
        .click();
    return this;
  }

  public CoursePage checkButtonToSubmitApp() {
    getRedirectButtonToSubmitApp()
        .shouldBe(Condition.visible);
    Assertions.assertEquals("Оставить заявку", getRedirectButtonToSubmitApp().getText());
    Assertions.assertTrue(getRedirectButtonToSubmitApp().isDisplayed());
    return this;
  }
}
