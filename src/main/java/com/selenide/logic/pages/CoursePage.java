package com.selenide.logic.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CoursePage extends BasePage<CoursePage> {
  private final SelenideElement linkForPay = $x("//div/u/a[contains(text(), '')]");

  public CoursePage checkLinkForPay() {
    linkForPay
        .shouldBe(Condition.visible)
        .scrollTo()
        .click();
    return this;
  }
}
