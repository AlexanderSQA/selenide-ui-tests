package com.selenide.logic.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

public abstract class BasePage<T> {

  private SelenideElement mainBanner = $(Selectors.byTagName("h1"));

  public T openPage(String url) {
    Selenide.open(url);
    return (T) this;
  }

  public T mainBannerShouldBeHasHeader(String expectedHeader) {
    Assertions.assertEquals(mainBanner.getText(), expectedHeader);
    return (T) this;
  }
}
