package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {

    private SelenideElement
            lagship_products = $$(".row-s-title").findBy(text("Флагманские продукты"));

    //public ProductPage checkPage

}
