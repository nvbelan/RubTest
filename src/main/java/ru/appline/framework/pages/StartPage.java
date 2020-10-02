package ru.appline.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static ru.appline.framework.utils.ConstConteiner.getMenuVklad;

public class StartPage extends BasePage {

    @FindBy(xpath = "//div[text()='Вклады']/..")
    List<WebElement> lowerMenu;

    @Step("Выбираем меню 'Вклад'")
    public VkladPage selectMenuVklad() {
        selectMenu(lowerMenu, getMenuVklad());
        return app.getVkladPage();
    }
}
