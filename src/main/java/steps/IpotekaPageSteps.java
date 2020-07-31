package steps;

import io.qameta.allure.Step;
import pages.IpotekaPage;

public class IpotekaPageSteps extends BaseSteps {

    private IpotekaPage ipotekaPage = pageManager.getIpotekaPage();

    @Step("Заполнить стоимость недвижимости")
    public IpotekaPageSteps inputRealEstateCostStep(String value) {
        ipotekaPage.inputRealEstateCost(value);
        return this;
    }

    @Step("Заполнить первоначальный взнос")
    public IpotekaPageSteps inputFirstPayStep(String value) {
        ipotekaPage.inputFirstPay(value);
        return this;
    }

    @Step("Заполнить срок кредита")
    public IpotekaPageSteps inputCreditTermStep(String value) {
        ipotekaPage.inputCreditTerm(value);
        return this;
    }

    @Step("Убрать пункт 'Зарплатная карта Сбербанка'")
    public IpotekaPageSteps clickSberCardTumblerStep() {
        ipotekaPage.clickSberCardTumbler();
        return this;
    }

    @Step("Выбрать пункт 'Молодая семья'")
    public IpotekaPageSteps clickSGreenFamilyStep() {
        ipotekaPage.clickSGreenFamily();
        return this;
    }

    @Step("Проверка ежемесячного платежа")
    public IpotekaPageSteps checkMonthlyPaymentStep(String value) {
        ipotekaPage.checkMonthlyPayment(value);
        return this;
    }

    @Step("Проверка суммы кредита")
    public IpotekaPageSteps checkCreditAmountStep(String value) {
        ipotekaPage.checkCreditAmount(value);
        return this;
    }

    @Step("Проверка необходимого дохода")
    public IpotekaPageSteps checkNecessaryIncomeStep(String value) {
        ipotekaPage.checkNecessaryIncome(value);
        return this;
    }

    @Step("Проверка процентной ставки")
    public IpotekaPageSteps checkCreditRateStep(String value) {
        ipotekaPage.checkCreditRate(value);
        return this;
    }
}
