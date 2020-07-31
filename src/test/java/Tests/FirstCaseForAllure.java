package Tests;

import BaseTests.BaseTest;
import org.junit.jupiter.api.Test;

import static managers.PageStepsManager.*;

public class FirstCaseForAllure extends BaseTest {

    @Test
    void runTest() {
        getPageStepsManager().
                getStartPageSteps().
                selectIpotekaMenuStep().
                ipotekaClickLinkStep().
                inputRealEstateCostStep("5180000").
                inputFirstPayStep("3058000").
                inputCreditTermStep("30").
                clickSberCardTumblerStep().
                clickSGreenFamilyStep().
                checkMonthlyPaymentStep("34 810 ₽").
                checkCreditAmountStep("2 122 000 ₽").
                checkNecessaryIncomeStep("20 811 ₽").
                checkCreditRateStep("11%");

    }
}
