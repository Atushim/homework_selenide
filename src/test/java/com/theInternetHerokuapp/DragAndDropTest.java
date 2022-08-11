package com.theInternetHerokuapp;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class DragAndDropTest {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";

    }

    @Test
    void dragAndDrop() {
        open("/drag_and_drop");
       /* через actions не работает. будет работать если мышку во время теста навести на нужное место.
        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        */
        open("/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }


}
