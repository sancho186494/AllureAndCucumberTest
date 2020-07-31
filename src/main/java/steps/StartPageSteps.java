package steps;

import io.qameta.allure.Step;
import pages.StartPage;
import utils.AllureUtils;

public class StartPageSteps extends BaseSteps {

    private StartPage startPage = pageManager.getStartPage();

    @Step("Навестись на меню 'Ипотека'")
    public StartPageSteps selectIpotekaMenuStep() {
        startPage.selectIpotekaMenu();
        return this;
    }

    @Step("Кликнуть ссылку 'Ипотека на готовое жилье'")
    public IpotekaPageSteps ipotekaClickLinkStep() {
        startPage.ipotekaClickLink();
        return pageStepsManager.getIpotekaPageSteps();
    }
}
