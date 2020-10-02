package ru.appline.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static ru.appline.framework.utils.ConstConteiner.*;

public class VkladPage extends BasePage {
    @FindBy(xpath = "//h2[@class='calculator-block__title block-title']")
    WebElement checkableTitle;
    @FindBy(xpath = "//span[@class='calculator__currency-field-text']")
    List<WebElement> valuta;
    @FindBy(xpath = "//input[@name='amount']")
    WebElement fillVkladSumm;
    @FindBy(xpath = "//div[@class='jq-selectbox__select']/..")
    WebElement srok;
    @FindBy(xpath = "//div[@class='jq-selectbox__dropdown']//li")
    List <WebElement> srokList;
    @FindBy(xpath ="//input[@name='replenish']")
    WebElement fillEveryMonth;
    @FindBy(xpath = "//span[text()='Ежемесячная капитализация']/../..//div[contains(@class, 'jq-checkbox calculator__check')]")
    WebElement capitalEveryMonthTick;
    @FindBy(xpath = "//span[@class='js-calc-earned']")
    WebElement accruedProcent;
    @FindBy (xpath = "//span[@class='js-calc-replenish']")
    WebElement replenish;
    @FindBy(xpath ="//span[@class='js-calc-result']")
    WebElement result;
    @FindBy(xpath ="//div[@class='calculator__check-row-field check-deposit']//div[contains(@class,'calculator')]")
    WebElement upTick;

    @Step("Проверяем переход на страницу 'Вклады'")
    public VkladPage checkT() {
        checkText(checkableTitle, getCheckableText());
        return this;
    }

    @Step("Выбираем - Рубли")
    public VkladPage setValute() {
        selectMenu(valuta, getValuta());
        return this;
    }

    @Step("Устанавливаем сумму вклада и Ежемесячное пополнение")
    public VkladPage setVkladSumm() {
        fillInputField(fillVkladSumm, getVkladSumm());
        fillInputField(fillEveryMonth,getFillEveryMonth());
        return this;
    }

    @Step("Устанавливаем срок вклада")
    public VkladPage setSrok() {
        srok.click();
        selectMenuMonth(srokList,getSrok());
        return this;
    }

    @Step("Устанавливаем галочку Ежемесячная капитализация и В отделении банка")
    public VkladPage setTicks(){
        setTick(capitalEveryMonthTick,isCapitalEveryMonthTick());
        setTick(upTick, isUpTick());
        return this;
    }

    @Step("Проверяем поля")
    public VkladPage checkfills(){
        checkText(accruedProcent,getAccryedProcent());
        checkText(replenish,getReplenish());
        checkText(result,getResult());
        return this;
    }


}
