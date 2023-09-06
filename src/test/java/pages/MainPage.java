package pages;

import com.codeborne.selenide.SelenideElement;
import tests.naumen.MainPageTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement
            headerTitle = $(".logo"),
            menu_product = $$(".link").findBy(text("Продукты")),
            menu_services = $$(".link").findBy(text("Услуги")),
            menu_clients = $$(".link").findBy(text("Клиенты")),
            menu_partners = $$(".link").findBy(text("Партнеры")),
            menu_about = $$(".link").findBy(text("О нас")),
            menu_press_center = $$(".link").findBy(text("Пресс-центр")),
            menu_career = $$(".link").findBy(text("Карьера"));


    public MainPage openPage() {
        open();
        return this;
    }

    public MainPage clickMenuProducts() {
        menu_product.click();
        return this;
    }

    public MainPage checkPage(String value) {

        return this;
    }

}
