package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageStepsManager;

public class StepDefinitions {
    private static PageStepsManager pageStepsManager = PageStepsManager.getPageStepsManager();

    @When("выбрано меню Ипотека")
    public void selectMenuIpoteka() {
        pageStepsManager.getStartPageSteps().selectIpotekaMenuStep();
    }

    @And("выбрана ссылка Ипотека на готовое жилье")
    public void clickLinkIpoteka() {
        pageStepsManager.getStartPageSteps().ipotekaClickLinkStep();
    }

    @And("заполняется поле Стоимость недвижимости {string}")
    public void inputEstateCost(String cost) {
        pageStepsManager.getIpotekaPageSteps().inputRealEstateCostStep(cost);
    }

    @And("заполняется поле Первоначальный взнос {string}")
    public void inputFirstPay(String pay) {
        pageStepsManager.getIpotekaPageSteps().inputFirstPayStep(pay);
    }

    @And("заполняется поле Срок кредита {string}")
    public void inputTerm(String term) {
        pageStepsManager.getIpotekaPageSteps().inputCreditTermStep(term);
    }

    @And("Снять галочку - есть зарплатная карта сбербанка")
    public void deselectSberCard() {
        pageStepsManager.getIpotekaPageSteps().clickSberCardTumblerStep();
    }

    @And("поставить галочку Молодая семья")
    public void selectGreenFamily() {
        pageStepsManager.getIpotekaPageSteps().clickSGreenFamilyStep();
    }

    @Then("ежемесячный платеж равен {string}")
    public void checkMonthlyPayment(String value) {
        pageStepsManager.getIpotekaPageSteps().checkMonthlyPaymentStep(value);
    }

    @Then("сумма кредита равна {string}")
    public void checkCreditAmount(String value) {
        pageStepsManager.getIpotekaPageSteps().checkCreditAmountStep(value);
    }

    @Then("необходимый доход равен {string}")
    public void checkNecessaryIncome(String value) {
        pageStepsManager.getIpotekaPageSteps().checkNecessaryIncomeStep(value);
    }

    @Then("ставка кредита равна {string}")
    public void checkCreditRate(String value) {
        pageStepsManager.getIpotekaPageSteps().checkCreditRateStep(value);
    }
}
