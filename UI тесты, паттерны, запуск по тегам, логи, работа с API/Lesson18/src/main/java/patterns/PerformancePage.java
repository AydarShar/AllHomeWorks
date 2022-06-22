package patterns;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$x;


// Page Object - взято выпадающее при наведении меню "Услуги и цены"
public class PerformancePage {
    public SelenideElement servicesAndProductsTab() {
        return $(By.id("menu-item-317"));
    }

    // Page Elements - взяты ссылки из выпадающего меню "Услуги и цены"
    public static class DropDownMenuElements {
        public SelenideElement siteTesting() {
            return $$x("//a[contains(text(),'Тестирование сайта')]").get(1);
        }

        public SelenideElement automationTesting() {
            return $$x("//a[contains(text(),'Автоматизация тестирования')]").get(2);
        }
    }
}
