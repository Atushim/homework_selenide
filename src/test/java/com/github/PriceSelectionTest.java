package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PriceSelectionTest {

    @Test
    void comparePlans(){
        open("https://github.com/");
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("h1.h2-mktg").shouldHave(text("Choose the plan that’s right for you."));
    }
}
