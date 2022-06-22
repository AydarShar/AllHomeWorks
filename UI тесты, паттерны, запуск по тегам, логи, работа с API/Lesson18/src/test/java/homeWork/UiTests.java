package homeWork;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import patterns.PerformancePage;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.*;

public class UiTests {

    private static final String ALLURE_SELENIDE_LISTENER_NAME = "AllureSelenide";

    static {
        SelenideLogger.addListener(ALLURE_SELENIDE_LISTENER_NAME, new AllureSelenide()
                .screenshots(true).savePageSource(false));
    }

    {
        Logger logger = LoggerFactory.getLogger(UiTests.class);
        logger.trace("Логер уровня инфо");
        logger.debug("Логер уровня дебаг");
        logger.info("Логер уровня инфо");
        logger.warn("Опасность!");
        logger.error("Ошибка!");
    }

    @Test
    @DisplayName("Задание 1")
    @Tag("googleSearch")
    void googleSearchTest() {
        // Arrange
        step("открываем google.ru", () -> {
            open("https://www.google.ru/");
        } );

        // Act
        step("в поле ввода вставлем \"performance lab\", нажимем Enter", () -> {
            $x("//input[contains(@title,'Поиск')]")
                    .shouldBe(visible)
                    .setValue("performance lab")
                    .pressEnter();
        });

        // Assert
        step("находим сайт компании, кликаем", () -> {
            $x("//a[contains(@href,'https://www.performance-lab.ru')]")
                    .shouldBe(visible).click();
        });

        Selenide.sleep(2000);
    }

    @Test
    @DisplayName("Задание 2")
    @Tag("buttonColor")
    void buttonColorTest() {
        // Arrange
        PerformancePage performancePage = new PerformancePage();

        step ("открыть страницу performance-lab.ru", () -> {
            open("https://www.performance-lab.ru/");});

        // Act
        step("навести на меню \"Услуги и цены\" ", () -> {
            performancePage
                    .servicesAndProductsTab()
                    .shouldBe(visible)
                    .hover();});

        step("перейти по ссылке \"Тестирование сайта\"", () -> {
                    new PerformancePage
                            .DropDownMenuElements()
                            .siteTesting()
                            .shouldBe(visible)
                            .click();});

        step("переключаем на 2-ю вкладку браузера", () -> {
            switchTo().window(1);});

        String value = step("находим кнопку и берем ее цвет", () -> {
            return $$x("//a[contains(@role, 'button')]")
                    .get(0)
                    .shouldBe(visible)
                    .getCssValue("background-color");});

        // Assert
        step("проверяем что кнопка синяя" , () -> {
            assertEquals("rgba(79, 173, 255, 1)", value);});

        Selenide.sleep(2000);
    }


    @Test
    @DisplayName("Задание 3")
    @Tag("formIsOpen")
    void formIsOpenTest() {
        // Arrange
        PerformancePage performancePage = new PerformancePage();

        step ("открыть страницу performance-lab.ru", () -> {
            open("https://www.performance-lab.ru/");});

        // Act
        step("навести на меню \"Услуги и цены\" ", () -> {
            performancePage
                    .servicesAndProductsTab()
                    .shouldBe(visible)
                    .hover();});

        step("перейти по ссылке \"Автоматизация тестирования\" ", () -> {
            new PerformancePage
                    .DropDownMenuElements().automationTesting()
                    .shouldBe(visible)
                    .click();});

        step("скрол к тексту \"Примеры выполненных проектов\"", () -> {
            $x("//h3[contains(text(), 'Примеры выполненных проектов')]")
                    .scrollTo();});

        step("найти картинку под текстом \"автоматизация тестирования\", кликнуть на неё", () -> {
            $x("//img[contains(@alt, 'автоматизация тестирования')]")
                    .click();});

        // Assert
        step("проверить что форма видна", () -> {
            $(By.id("hubspot-Modal-form-Brrrochur")).shouldBe(visible);});

        Selenide.sleep(2000);
    }

    @AfterEach
    public void closeWindow() {
        Selenide.closeWindow(); // закрытие окна после каждого теста
    }
}