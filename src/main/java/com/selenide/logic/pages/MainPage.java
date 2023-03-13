package com.selenide.logic.pages;

import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

public class MainPage extends BasePage<MainPage> {

  private ElementsCollection getElCourses() {
    return $$(".lessons__new-item-container");
  }

  /**
   * @param filterText указываем значение для поиска нужной плитки
   * @return Совершаем переход по найденной плитке
   */
  public MainPage getCourseByName(String filterText) {
    getElCourses()
        .shouldBe(CollectionCondition.sizeGreaterThan(0))
        .filter(Condition.text(filterText))
        .first()
        .scrollTo()
        .click();
    return this;
  }

}
