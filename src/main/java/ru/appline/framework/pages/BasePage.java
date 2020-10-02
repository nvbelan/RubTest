package ru.appline.framework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.appline.framework.managers.ManagerPages;

import java.util.List;

import static ru.appline.framework.managers.DriverManager.getDriver;

public class BasePage {
    protected ManagerPages app = ManagerPages.getManagerPages();

    protected JavascriptExecutor js = (JavascriptExecutor) getDriver();

    protected WebDriverWait wait = new WebDriverWait(getDriver(), 40, 200);

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    protected void scrollToElementJs(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void fillInputField(WebElement field, String value) {
        if (!(field.isDisplayed())) {
            scrollToElementJs(field);
        }
        int i = field.getAttribute("value").length();
        do {
            field.sendKeys(Keys.BACK_SPACE);
            i--;
        } while (i > 0);
        field.sendKeys(value);
    }

    public void clicker(WebElement element) {
        if (!element.isDisplayed()) {
            scrollToElementJs(element);
        }
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


    public void selectMenu(List<WebElement> b, String name) {
        for (WebElement a : b) {
            if (a.getText().contains(name)) {
                clicker(a);
            }
        }
    }

    public void selectMenuMonth(List<WebElement> b, String name) {
        for (WebElement a : b) {
            if (a.getText().contains(name)) {
                a.click();
            }
        }
    }

    public void setTick(WebElement element, boolean value) {
        if (element.getAttribute("class").contains("checked") != value) {
            clicker(element);
        }
    }

    public void sleeper(long a) {
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void alarm(String mess) {
        throw new AssertionError(mess);
    }

    public void checkText(WebElement a, String name) {

        wait.until(ExpectedConditions.visibilityOf(a));
        int i = 0;
        do {
            sleeper(150);
            i++;
        } while (!(a.getText().contains(name)) && i <= 10);
        if (i > 10) {
            switch (name) {
                case "8 490,49":
                    alarm("Несовпадает поле начислено %");
                    break;
                case "250 000":
                    alarm("Несовпадает поле пополнение за " + name);
                    break;
                case "558 490,49":
                    alarm("Несовпадает поле К снятию");
                    break;
                case "Рассчитайте доходность по вкладу":
                    alarm("Переход на страницу произведен с ошибкой");
                    break;
                default:
                    alarm("Непредвиденное значение");
                    break;
            }
        }
    }

}


