package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.opentest4j.AssertionFailedError;

import static managers.DriverManager.*;
import static managers.DriverManager.getDriver;

public class IpotekaPage extends BasePage {

    @FindBy(xpath = "//div[@data-label='Стоимость недвижимости']//input")
    private WebElement realEstateCost;

    @FindBy(xpath = "//div[@data-label='Первоначальный взнос']//input")
    private WebElement firstPay;

    @FindBy(xpath = "//span[text()='Есть зарплатная карта Сбербанка']//..//input")
    private WebElement sberCardTumbler;

    @FindBy(xpath = "//div[@data-label='Срок кредита']//input")
    private WebElement creditTerm;

    @FindBy(xpath = "//span[text()='Есть возможность подтвердить доход справкой']")
    private WebElement referenceConfirm;

    @FindBy(xpath = "//div[text()='Дополнительные услуги, снижающие ставку по кредиту']")
    private WebElement optionsHeader;

    @FindBy(xpath = "//span[text()='Молодая семья']//..//..//input")
    private WebElement greenFamily;

    @FindBy(xpath = "//h2[text()='\u200BРассчитайте ипотеку']")
    private WebElement h2;

    @FindBy(xpath = "//iframe[@title='Основной контент']")
    private WebElement frame;

    @FindBy(xpath = "(//div[@class='styles_resultSection__37omF']//span[text()='Ежемесячный платеж']//..//span)[3]")
    private WebElement monthlyPayment;

    @FindBy(xpath = "(//div[@class='styles_resultSection__37omF']//span[text()='Сумма кредита']//..//span)[3]")
    private WebElement creditAmount;

    @FindBy(xpath = "(//div[@class='styles_resultSection__37omF']//span[text()='Необходимый доход']//..//span)[3]")
    private WebElement necessaryIncome;

    @FindBy(xpath = "(//div[@class='styles_resultSection__37omF']//span[text()='Процентная ставка']//..//span)[3]")
    private WebElement creditRate;

    {
        js.executeScript("arguments[0].scrollIntoView(true);", h2);
        getDriver().switchTo().frame(frame);
    }

    public IpotekaPage inputRealEstateCost(String value) {
        inputValues(realEstateCost, value);
        return this;
    }

    public IpotekaPage inputFirstPay(String value) {
        inputValues(firstPay, value);
        return this;
    }
    public IpotekaPage inputCreditTerm(String value) {
        inputValues(creditTerm, value);
        return this;
    }

    public IpotekaPage clickSberCardTumbler() {
        sberCardTumbler.click();
        Assertions.assertTrue(referenceConfirm.isDisplayed(), "Элемент 'Есть возможность подтвердить доход справкой' не появился");
        return this;
    }

    public IpotekaPage clickSGreenFamily() {
        js.executeScript("arguments[0].scrollIntoView(true);", optionsHeader);
        greenFamily.click();
        getDriver().switchTo().defaultContent();
        js.executeScript("arguments[0].scrollIntoView(true);", h2);
        h2.isDisplayed();
        getDriver().switchTo().frame(frame);
        return this;
    }

    public IpotekaPage checkMonthlyPayment(String value) {
        Assertions.assertEquals(value, monthlyPayment.getText(), "Ежемесячный платеж не соответствует");
        return this;
    }

    public IpotekaPage checkCreditAmount(String value) {
        Assertions.assertEquals(value, creditAmount.getText(), "Сумма кредита не соответствует");
        return this;
    }

    public IpotekaPage checkNecessaryIncome(String value) {
        Assertions.assertEquals(value, necessaryIncome.getText(), "Необходимы доход не соответствует");
        return this;
    }

    public IpotekaPage checkCreditRate(String value) {
        Assertions.assertEquals(value, creditRate.getText(), "Процентная ставка не соответствует");
        return this;
    }

}
