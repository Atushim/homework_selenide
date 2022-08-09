package com.github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenide {




    @Test
    void testSearchSelenide(){
        //Открываем странциу selenide
    open("https://github.com/");
    $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
    $("ul.repo-list li a").click();
    // Переходим в раздел Wiki
    $("#wiki-tab").click();
    //Открываем полностью список страниц и проверяем наличие SoftAssertions
    $(byText("Show 2 more pages…")).click();
    $("#wiki-pages-box").shouldHave(textCaseSensitive("SoftAssertions"));

    //Переходим на странциу SoftAssertions и проверяем наличие примера для Junit 5
    $(byText("SoftAssertions")).click();
    $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));


    }
}
